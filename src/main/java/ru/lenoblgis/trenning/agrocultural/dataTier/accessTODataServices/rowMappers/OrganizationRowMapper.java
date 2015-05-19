package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;

public class OrganizationRowMapper implements RowMapper<Organization>, Serializable {

	/**
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Organization(rs.getInt("id"), rs.getString("name"), rs.getInt("inn"), rs.getString("address_org"));
	}

}
