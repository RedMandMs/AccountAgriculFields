package dataTier.accessToDataServices.fields.SQLQueries;

import java.util.Map;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public interface SQLQueries {

	public String createOwner();
	public String deleteOwner();
	public String editOwner();
	public String reviewOwner();
	
	public String createPassport();
	public String deletePassport();
	public String editFieldsPassport();
	public String reviewPassport();
	
	public String reviewAllPassports();
	public String findPassports(Map<String, String> info);
	
}
