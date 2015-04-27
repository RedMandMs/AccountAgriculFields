package dataTier.accessToDataServices.fields.SQLQueries;

import java.util.Map;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public interface SQLQueries {

	public String createOwner();
	public String deleteOwner();
	public String editOwner(Map<String, String> info);
	public String reviewOwner();
	
	public String createPassport();
	public String deletePassport();
	public String editFieldsPassport(Map<String, String> info);
	public String reviewPassport();
	
	public String reviewAllPassports();
	public String findPassports(Map<String, String> info);
	
}
