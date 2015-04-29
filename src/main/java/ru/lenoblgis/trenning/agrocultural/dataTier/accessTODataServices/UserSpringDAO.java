package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLServerQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.OrganizationRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.PassportRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class UserSpringDAO implements DAO{

	public UserSpringDAO(){
		postConstruct();
	}
	
	SQLQueries sqlQueries = new SQLServerQueries();
	SQLServerDataSource ds = null;
	JdbcTemplate jdbcTemplate = null;
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	
	/*
	 * Подключение DataSource к базе данных и создание jdbcTemplate
	 */
	public void postConstruct(){
		ds = new SQLServerDataSource();
		ds.setPortNumber(1433);
		ds.setHostNameInCertificate("localhost");
		ds.setDatabaseName("passport_agricultural");
		ds.setUser("sergey");
		ds.setPassword("lenoblgissergey");
		
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createOwner(Map<String, String> info) {
		
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deleteOwner(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id")};
		jdbcTemplate.update(sqlQueries.deleteOwner(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editOwner(Map<String, String> info) {
		Object [] values = new Object[]{info.get("value"), info.get("id")};
		String sqlQuery = sqlQueries.editOwner(info);
		jdbcTemplate.update(sqlQuery, values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Owner reviewOwner(Map<String, String> info) {
		//?
		/*Object [] values = new Object[]{Integer.valueOf(info.get("id"))};
		List<Organization> resultSet = jdbcTemplate.query(sqlQueries.reviewOwner(), values, organizationRowMapper);
		return  resultSet.get(0);*/
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#createPassport(java.util.Map)
	 */
	public void createPassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id_organization"), info.get("region"), info.get("cadastr_number"), 
										info.get("area"), info.get("type_field"), info.get("comment")};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#deletePassport(java.util.Map)
	 */
	public void deletePassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id")};
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#editFieldsPassport(java.util.Map)
	 */
	public void editFieldsPassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("value"), info.get("id")};
		jdbcTemplate.update(sqlQueries.editFieldsPassport(info), values);
	}

	/*
	 * (non-Javadoc)
	 * @see dataTier.accessToDataServices.DAO#reviewPassport(java.util.Map)
	 */
	public Passport reviewPassport(Map<String, String> info) {
		Object[] values = new Object[] {info.get("id")};
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
