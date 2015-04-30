package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries;

import java.util.Map;

public class SQLServerQueries implements SQLQueries {

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#createOwner()
	 */
	public String createOwner() {
		return "INSERT INTO organization_table(name, inn, address_org) VALUES(?,?,?)";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#deleteOwner()
	 */
	public String deleteOwner() {
		return "DELETE FROM organization_table "
				+ " WHERE (id = ?)";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#editOwner(java.util.Map)
	 */
	public String editOwner() {
		return "UPDATE organization_table "
				+ " SET "
				+ " name = ? , "
				+ " inn = ? , "
				+ " address_org = ? "
				+ " WHERE (id = ?)";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#reviewOwner()
	 */
	public String reviewOwner() {
		return "SELECT * "
				+ " FROM organization_table "
				+ " WHERE (id = ?)";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#createPassport()
	 */
	public String createPassport() {
		return "INSERT INTO field_table(id_organization, region, cadastr_number, area, type_field, comment) VALUES(?,?,?,?,?,?)";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#deletePassport()
	 */
	public String deletePassport() {
		return "DELETE FROM field_table "
				+ " WHERE (id = ?); ";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#editFieldsPassport(java.util.Map)
	 */
	public String editFieldsPassport() {
		return "UPDATE field_table "
				+ " SET "
				+ " id_organization = ? "
				+ " region = ? "
				+ " cadastr_number = ? "
				+ " area = ? "
				+ " type_field = ? "
				+ " comment = ? "
				+ " WHERE (id = ?);";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#reviewPassport()
	 */
	public String reviewPassport() {
		return "SELECT * "
				+ " FROM field_table "
				+ " WHERE (id = ?);";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#reviewAllPassports()
	 */
	public String reviewAllPassports() {
		return "SELECT * "
				+ " FROM field_table ";
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries#findPassports(java.util.Map)
	 */
	public String findPassports(Map<String, String> info) {
		String query = "SELECT * FROM field_table WHERE (";
		String condition = "";
		
		if(info.containsKey("id")) condition = condition + "id = " + Integer.parseInt(info.get("id"));
		if(info.containsKey("id_organization")) condition = condition + " AND id_organization = " + Integer.parseInt(info.get("id_organization"));
		if(info.containsKey("region")) condition = condition + " AND region = '" + info.get("region") + "'";
		if(info.containsKey("cadastr_number")) condition = condition + " AND cadastr_number = " + Integer.parseInt(info.get("cadastr_number"));
		if(info.containsKey("area")) condition = condition + " AND area = " + Integer.parseInt(info.get("area"));
		if(info.containsKey("type_field")) condition = condition + " AND type_field = '" + info.get("type_field") + "'";
		if(info.containsKey("comment")) condition = condition + " AND comment LIKE '" + info.get("comment") + "'";
		
		String [] withoutAnd = condition.split(" ", 3);
		if(withoutAnd[1].equals("AND")) condition = withoutAnd[2];
		query = query + condition + ");";
		return query;
	}
	
}
