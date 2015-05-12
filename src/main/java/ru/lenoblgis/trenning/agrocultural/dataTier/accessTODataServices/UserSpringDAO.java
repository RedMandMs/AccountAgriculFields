package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLServerQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.EventRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.OrganizationRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.PassportRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class UserSpringDAO implements DAO{

	/**
	 * Константа имени перечисления для добавления события - добавление поля
	 */
	private static final String ADD_EVENT = "ADDITION";
	/**
	 * Константа имени перечисления для добавления события - редактированиe поля
	 */
	private static final String EDIT_EVENT = "EDITION";
	/**
	 * Константа имени перечисления для добавления события - удаление поля
	 */
	private static final String DELETE_EVENT = "DELETION";
	/**
	 * Константа имени перечисления для добавления события - просмотр поля
	 */
	private static final String REVIEW_EVENT = "REVIEW";

	/**
	 * Конструктор по-умолчанию
	 */
	public UserSpringDAO(){
		postConstruct();
	}
	
	/**
	 * Объект для получения текста запросов
	 */
	SQLQueries sqlQueries = new SQLServerQueries();
	/**
	 * Объект DataSource
	 */
	SQLServerDataSource ds = null;
	/**
	 * Объект спринг для взаимодействия базы данных
	 */
	JdbcTemplate jdbcTemplate = null;
	/**
	 * Объект, отображающий пасспорт в программный объект из БД
	 */
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	/**
	 * Объект, отображающий организацию в программный объект из БД
	 */
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	/**
	 * Объект, отображающий событие в программный объект из БД
	 */
	EventRowMapper eventRowMapper = new EventRowMapper();
	
	/**
	 * Подключение DataSource к базе данных и создание jdbcTemplate
	 */
	public void postConstruct(){
		ds = new SQLServerDataSource();
		ds.setPortNumber(1433);
		ds.setHostNameInCertificate("localhost");
		ds.setDatabaseName("passport_agricultural");
		ds.setUser("userAgricultural");
		ds.setPassword("user123");
		
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	/**
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
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), 
										passport.getArea(), passport.getType(), passport.getComment()};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
		
		//Находим только что добавленный паспорт по максимальному Id пасспорта данной организации
		passport.setID(getPassportwithMaxId(passport.getIdOwner()));
		
		//Сформировать событие добавления поля
		addPassportEvent(passport, ADD_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deletePassport(int id) {
		Object [] values = new Object[]{id};
		Passport passport = reviewPassport(id);
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
		
		//Сформировать событие удаления поля
		addPassportEvent(passport, DELETE_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), passport.getArea(), passport.getType(), passport.getComment(), passport.getID()};
		jdbcTemplate.update(sqlQueries.editPassport(), values);

		//Сформировать событие редактирования поля
		addPassportEvent(passport, EDIT_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Passport reviewPassport(int id) {
		Object[] values = new Object[] {id};
		List<Passport> resultSet = jdbcTemplate.query(sqlQueries.reviewPassport(), values , passportRowMapper);

		//Сформировать событие просмотра поля
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
	 * Создание нового события в базе данных
	 */
	private void addPassportEvent(Passport passport, String TypeEvent) {
		PassportEvent event = new PassportEvent(passport, TypeEvent, this);
		Object[] values = new Object[] {event.getIdPassport(), event.getIdAuthor(), event.getMessage(), event.getType()};
		String sqlQuery = sqlQueries.createPassportEvent();
		jdbcTemplate.update(sqlQuery, values);
	}
	
	/**
	 * Удаление записи события из БД
	 * @param idEvent - id удаляемого события
	 */
	public void deletePassportEvent(int idEvent){
		//Нельяз пользователю
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#reviewAllPassportEvent()
	 */
	public List<PassportEvent> reviewAllPassportEvent(){
		//Нельяз пользователю
		return null;
	}
	
	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#reviewAllOwnerEvents(int)
	 */
	public List<PassportEvent> reviewAllOwnerEvents(int idOwner) {
		List<PassportEvent> events = new ArrayList<PassportEvent>();
		events = jdbcTemplate.query(sqlQueries.reviwAllOwnerPassportEvent(), new Object[]{idOwner}, eventRowMapper);
		return events;
	}

	/**
	 * Получаем id паспорта организации, который является максимальным среди всех id поспартов этой организации
	 * @param idOwner - id Владельца
	 * @return - id
	 */
	private int getPassportwithMaxId(int idOwner) {
		return jdbcTemplate.queryForInt(sqlQueries.getMAXidPassportByOwner(), new Object[]{idOwner});
	}
	
}
