package dataTier.accessToDataServices.fields.SQLQueries;

import java.util.Map;

public class SQLServerQueries implements SQLQueries {

	public String createOwner() {
		return "INSERT INTO organization_table(name, inn, address_org) VALUES(?,?,?) GO";
	}

	public String deleteOwner() {
		return "DELETE FROM organization_table "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String editOwner() {
		return "UPDATE organization_table "
				+ " SET "
				+ " [?] = ? "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String reviewOwner() {
		return "SELECT * "
				+ " FROM organization_table "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String createPassport() {
		return "INSERT INTO field_table(id_organization, region, cadastr_number, area, type_field, comment) VALUES(?,?,?,?,?,?) GO";
	}

	public String deletePassport() {
		return "DELETE FROM field_table "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String editFieldsPassport() {
		return "UPDATE field_table "
				+ " SET "
				+ " [?] = ? "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String reviewPassport() {
		return "SELECT * "
				+ " FROM field_table "
				+ " WHERE (id = ?) "
				+ " GO ";
	}

	public String reviewAllPassports() {
		return "SELECT * "
				+ " FROM field_table "
				+ " GO ";
	}

	public String findPassports(Map<String, String> info) {
		String query = "SELECT * FROM field_table WHERE (";
		if(info.containsKey("id")) query = query + "id = " + info.get("id");
		return query;
	}
	
}
