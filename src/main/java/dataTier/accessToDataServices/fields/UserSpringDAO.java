package dataTier.accessToDataServices.fields;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import dataTier.accessToDataServices.DAO;
import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class UserSpringDAO implements DAO{

	public UserSpringDAO(){
		
	}
	
	SQLServerDataSource ds = null;
	 JdbcTemplate jdbcTemplate = null;
	
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
		// ������!!!!
	}

	public void deleteOwner(Map<String, String> info) {
		// ������ ����!!!!
		
	}

	public void editOwner(Map<String, String> info) {
		// ������ ����!!!!
		
	}

	public Owner reviewOwner(Map<String, String> info) {
		//�����???
		return null;
	}

	public void createPassport(Map<String, String> info) {
		//����? ����������!
		
	}

	public void deletePassport(Map<String, String> info) {
		// ����? ����������!
		
	}

	public void editFieldsPassport(Map<String, String> info) {
		// ����? ����������!
		
	}

	public Passport reviewPassport(Map<String, String> info) {
		// ����������!
		return null;
	}

	public Passport[] reviewAllPassports() {
		// ����������!
		return null;
	}

	public Passport[] findPassports(Map<String, String> info) {
		// ����������!
		return null;
	}

}
