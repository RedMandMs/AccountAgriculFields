package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.User;

public class UserRowMapper implements RowMapper<User>, Serializable{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(rs.getInt("id"), rs.getString("user_login"), rs.getString("user_password"), rs.getInt("id_organization"));
	}
	
	

}
