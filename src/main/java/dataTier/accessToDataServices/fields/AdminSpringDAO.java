package dataTier.accessToDataServices.fields;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import dataTier.accessToDataServices.DAO;
import dataTier.accessToDataServices.fields.SQLQueries.SQLQueries;
import dataTier.accessToDataServices.fields.SQLQueries.SQLServerQueries;
import dataTier.accessToDataServices.fields.rowMappers.OrganizationRowMapper;
import dataTier.accessToDataServices.fields.rowMappers.PassportRowMapper;
import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.owner.organization.Organization;
import dataTier.domenModel.passport.Passport;

public class AdminSpringDAO implements DAO {

	public AdminSpringDAO(){
		postConstruct();
	}
	
	SQLQueries sqlQueries = new SQLServerQueries();
	SQLServerDataSource ds = null;
	JdbcTemplate jdbcTemplate = null;
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	
	public void postConstruct(){
		ds = new SQLServerDataSource();
		ds.setPortNumber(1433);
		ds.setHostNameInCertificate("localhost");
		ds.setDatabaseName("passport_agricultural");
		ds.setUser("sergey");
		ds.setPassword("lenoblgissergey");
		
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	public void createOwner(Map<String, String> info) {
		Object [] values = new Object[]{(String) info.get("name"), Integer.valueOf(info.get("inn")), (String) info.get("address_org")};
		String sqlQuery = sqlQueries.createOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	public void deleteOwner(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id")};
		jdbcTemplate.update(sqlQueries.deleteOwner(), values);
	}

	public void editOwner(Map<String, String> info) {
		Object [] values = new Object[]{info.get("value"), info.get("id")};
		String sqlQuery = sqlQueries.editOwner(info);
		jdbcTemplate.update(sqlQuery, values);
	}

	public Owner reviewOwner(Map<String, String> info) {
		Object [] values = new Object[]{Integer.valueOf(info.get("id"))};
		List<Organization> resultSet = jdbcTemplate.query(sqlQueries.reviewOwner(), values, organizationRowMapper);
		return  resultSet.get(0);
	}

	public void createPassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id_organization"), info.get("region"), info.get("cadastr_number"), 
										info.get("area"), info.get("type_field"), info.get("comment")};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
	}

	public void deletePassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("id")};
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
	}

	public void editFieldsPassport(Map<String, String> info) {
		Object [] values = new Object[]{info.get("value"), info.get("id")};
		jdbcTemplate.update(sqlQueries.editFieldsPassport(info), values);
	}

	public Passport reviewPassport(Map<String, String> info) {
		Object[] values = new Object[] {info.get("id")};
		List<Passport> resultSet = jdbcTemplate.query(sqlQueries.reviewPassport(), values , passportRowMapper);
		return resultSet.get(0);
	}

	public List<Passport> reviewAllPassports() {
		return jdbcTemplate.query(sqlQueries.reviewAllPassports(), passportRowMapper);
	}

	public List<Passport> findPassports(Map<String, String> info) {
		return jdbcTemplate.query(sqlQueries.findPassports(info), passportRowMapper);
	}

}
