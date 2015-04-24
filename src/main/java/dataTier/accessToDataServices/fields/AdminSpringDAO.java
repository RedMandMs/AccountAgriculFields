package dataTier.accessToDataServices.fields;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import dataTier.accessToDataServices.DAO;
import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class AdminSpringDAO implements DAO {

	public AdminSpringDAO(){
		
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
		// TODO Auto-generated method stub
		
	}

	public void deleteOwner(Map<String, String> info) {
		try{
			
		}catch(Exception ex){
			System.out.println("Ошибка доступа к Базе данных");
		}
	}

	public void editOwner(Map<String, String> info) {
		// TODO Auto-generated method stub
		
	}

	public Owner reviewOwner(Map<String, String> info) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createPassport(Map<String, String> info) {
		// TODO Auto-generated method stub
		
	}

	public void deletePassport(Map<String, String> info) {
		// TODO Auto-generated method stub
		
	}

	public void editFieldsPassport(Map<String, String> info) {
		// TODO Auto-generated method stub
		
	}

	public Passport reviewPassport(Map<String, String> info) {
		// TODO Auto-generated method stub
		return null;
	}

	public Passport[] reviewAllPassports() {
		// TODO Auto-generated method stub
		return null;
	}

	public Passport[] findPassports(Map<String, String> info) {
		// TODO Auto-generated method stub
		return null;
	}

}
