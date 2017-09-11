package org.byn.stickynotes.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user= new User();
		user.setName(rs.getString("name"));
		user.setUname(rs.getString("username"));
		user.setPwd(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		return user;
	}

}
