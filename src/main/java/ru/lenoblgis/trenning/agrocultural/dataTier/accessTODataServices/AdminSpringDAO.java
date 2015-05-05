package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLServerQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.OrganizationRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.PassportRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class AdminSpringDAO implements DAO  {

	public AdminSpringDAO(){
		postConstruct();
	}
	
	SQLQueries sqlQueries = new SQLServerQueries();
	SQLServerDataSource ds = null;
	JdbcTemplate jdbcTemplate = null;
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	
	/*
	 * ����������� DataSource � ���� ������ � �������� jdbcTemplate
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
	
	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres()};
		String sqlQuery = sqlQueries.createOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deleteOwner(int idOwner) {
		Object [] values = new Object[]{idOwner};
		jdbcTemplate.update(sqlQueries.deleteOwner(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres(), owner.getId()};
		String sqlQuery = sqlQueries.editOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Owner reviewOwner(int id) {
		Object [] values = new Object[]{id};
		List<Organization> resultSet = jdbcTemplate.query(sqlQueries.reviewOwner(), values, organizationRowMapper);
		return  resultSet.get(0);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#createPassport(java.util.Map)
	 */
	public void createPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), 
										passport.getArea(), passport.getType(), passport.getComment()};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#deletePassport(java.util.Map)
	 */
	public void deletePassport(int id) {
		Object [] values = new Object[]{id};
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#editFieldsPassport(java.util.Map)
	 */
	public void editFieldsPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), passport.getArea(), passport.getType(), passport.getComment(), passport.getID()};
		jdbcTemplate.update(sqlQueries.editFieldsPassport(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#reviewPassport(java.util.Map)
	 */
	public Passport reviewPassport(int id) {
		Object[] values = new Object[] {id};
		List<Passport> resultSet = jdbcTemplate.query(sqlQueries.reviewPassport(), values , passportRowMapper);
		return resultSet.get(0);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#reviewAllPassports()
	 */
	public List<Passport> reviewAllPassports() {
		return jdbcTemplate.query(sqlQueries.reviewAllPassports(), passportRowMapper);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#findPassports(java.util.Map)
	 */
	public List<Passport> findPassports(Map<String, String> info) {
		return jdbcTemplate.query(sqlQueries.findPassports(info), passportRowMapper);
	}

}
