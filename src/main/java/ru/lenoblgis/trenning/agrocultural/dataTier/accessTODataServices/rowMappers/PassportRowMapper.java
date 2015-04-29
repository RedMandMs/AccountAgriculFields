package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassportRowMapper implements RowMapper<Passport> {

	public Passport mapRow(ResultSet rs, int rowNum) throws SQLException {		
		return new Passport(rs.getInt("id"), rs.getInt("id_organization"), rs.getString("region"), rs.getInt("cadastr_number"
				+ ""), rs.getDouble("area"), rs.getString("type_field"), rs.getString("comment"));
	}

}
