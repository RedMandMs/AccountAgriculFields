package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrganizationRowMapper implements RowMapper<Organization> {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Organization(rs.getInt("id"), rs.getString("name"), rs.getInt("inn"), rs.getString("address_org"));
	}

}
