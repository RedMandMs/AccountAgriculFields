package dataTier.accessToDataServices.fields.rowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dataTier.domenModel.passport.Passport;
import dataTier.domenModel.passport.field.FieldPassport;

public class PassportRowMapper implements RowMapper<Passport> {

	public Passport mapRow(ResultSet rs, int rowNum) throws SQLException {		
		return new FieldPassport(rs.getInt("id"), rs.getInt("id_organization"), rs.getString("region"), rs.getInt("cadastr_number"
				+ ""), rs.getDouble("area"), rs.getString("type_field"), rs.getString("comment"));
	}

}
