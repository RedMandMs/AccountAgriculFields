package dataTier.accessToDataServices.fields.rowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dataTier.domenModel.owner.organization.Organization;

public class OrganizationRowMapper implements RowMapper<Organization> {

	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Organization(rs.getInt("id"), rs.getString("name"), rs.getInt("inn"), rs.getString("address"));
	}

}
