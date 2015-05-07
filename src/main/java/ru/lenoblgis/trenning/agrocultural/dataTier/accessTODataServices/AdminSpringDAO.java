package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLServerQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.OrganizationRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.PassportRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class AdminSpringDAO implements DAO  {
	
	private static final String ADD_EVENT = "ADDITION";
	private static final String EDIT_EVENT = "EDITION";
	private static final String DELETE_EVENT = "DELETION";
	private static final String REVIEW_EVENT = "REVIEW";

	public AdminSpringDAO(){
		postConstruct();
	}
	
	SQLQueries sqlQueries = new SQLServerQueries();
	SQLServerDataSource ds = null;
	JdbcTemplate jdbcTemplate = null;
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	
	/**
	 * ѕодключение DataSource к базе данных и создание jdbcTemplate
	 */
	public void postConstruct(){
		ds = new SQLServerDataSource();
		ds.setPortNumber(1433);
		ds.setHostNameInCertificate("localhost");
		ds.setDatabaseName("passport_agricultural");
		ds.setUser("adminAgricultural");
		ds.setPassword("admin123");
		
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres()};
		String sqlQuery = sqlQueries.createOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deleteOwner(int idOwner) {
		Object [] values = new Object[]{idOwner};
		jdbcTemplate.update(sqlQueries.deleteOwner(), values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres(), owner.getId()};
		String sqlQuery = sqlQueries.editOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Owner reviewOwner(int id) {
		Object [] values = new Object[]{id};
		List<Organization> resultSet = jdbcTemplate.query(sqlQueries.reviewOwner(), values, organizationRowMapper);
		return  resultSet.get(0);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#createPassport(java.util.Map)
	 */
	public void createPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), 
										passport.getArea(), passport.getType(), passport.getComment()};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
		
		//Ќаходим только что добавленный паспорт по максимальному Id пасспорта данной организации
		passport.setID(getPassportwithMaxId(passport.getIdOwner()));
		
		//—формировать событие добавлени€ пол€
		addPassportEvent(passport, ADD_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#deletePassport(java.util.Map)
	 */
	public void deletePassport(int id) {
		Object [] values = new Object[]{id};
		Passport passport = reviewPassport(id);
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
		
		//—формировать событие удалени€ пол€
		addPassportEvent(passport, DELETE_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#editPassport(java.util.Map)
	 */
	public void editPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), passport.getArea(), passport.getType(), passport.getComment(), passport.getID()};
		jdbcTemplate.update(sqlQueries.editPassport(), values);

		//—формировать событие редактировани€ пол€
		addPassportEvent(passport, EDIT_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewPassport(java.util.Map)
	 */
	public Passport reviewPassport(int id) {
		Object[] values = new Object[] {id};
		List<Passport> resultSet = jdbcTemplate.query(sqlQueries.reviewPassport(), values , passportRowMapper);

		//—формировать событие просмотра пол€
		addPassportEvent(resultSet.get(0), REVIEW_EVENT);
		return resultSet.get(0);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewAllPassports()
	 */
	public List<Passport> reviewAllPassports() {
		return jdbcTemplate.query(sqlQueries.reviewAllPassports(), passportRowMapper);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#findPassports(java.util.Map)
	 */
	public List<Passport> findPassports(Map<String, String> info) {
		return jdbcTemplate.query(sqlQueries.findPassports(info), passportRowMapper);
	}
	
	/**
	 * —оздание нового событи€ в базе данных
	 */
	private void addPassportEvent(Passport passport, String TypeEvent) {
		
		PassportEvent event = new PassportEvent(passport, TypeEvent, this);
		Object[] values = new Object[] {event.getIdPassport(), event.getIdAothor(), event.getMessage(), event.getType()};
		String sqlQuery = sqlQueries.createPassportEvent();
		jdbcTemplate.update(sqlQuery, values);
	}
	
	public void deletePassportEvent(int idEvent){
		jdbcTemplate.update(sqlQueries.deletePassportEvent(), new Object[]{idEvent});
	}

	/**
	 * ѕолучаем id паспорта организации, который €вл€етс€ максимальным среди всех id поспартов этой организации
	 * @param idOwner - id ¬ладельца
	 * @return - id
	 */
	private int getPassportwithMaxId(int idOwner) {
		return jdbcTemplate.queryForInt(sqlQueries.getMAXidPassportByOwner(), new Object[]{idOwner});
	}

}
