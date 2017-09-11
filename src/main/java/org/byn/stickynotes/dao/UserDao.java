package org.byn.stickynotes.dao;

import java.io.IOException;

import javax.sql.DataSource;

import org.byn.stickynotes.model.User;
import org.byn.stickynotes.model.UserMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private NamedParameterJdbcTemplate jdbcTemplate;

	User you;
	boolean flag;
	String sqlDelete = "delete from users where username=:username";
	String sqlRetrieve = "select * from users where username=:username";
	String sqlCount = "select count(*) from users where username=:username";

	@Autowired
	@Qualifier("dataSource")
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public boolean updateUserPassword(String username) {
		MapSqlParameterSource params = new MapSqlParameterSource("username",
				username);
		System.out.println("about to delete");
		// jdbcTemplate.update(sqlDelete, params);
		return true;

	}

	public String retrievePassword(String username)
			throws EmptyResultDataAccessException {
		MapSqlParameterSource params = new MapSqlParameterSource("username",
				username);
		System.out.println("about to retrieve");
		// you=jdbcTemplate.queryForObject(sqlRetieve, params, String.class);
		// you=jdbcTemplate.query(sqlRetrieve, new RowMapper<User>());
		you = jdbcTemplate
				.queryForObject(sqlRetrieve, params, new UserMapper());

		System.out.println(you.getUname());
		System.out.println(you.getName());
		System.out.println(you.getPwd());
		System.out.println(you.getEmail());
		return you.getPwd();
	}

	public User retrieveUser(String username)
			throws EmptyResultDataAccessException {
		MapSqlParameterSource params = new MapSqlParameterSource("username",
				username);
		System.out.println("about to retrieve User");
		you = jdbcTemplate.queryForObject(sqlRetrieve, params, new UserMapper());
		return you;
	}

	public boolean checkUserExistence(String username)
			throws EmptyResultDataAccessException {
		MapSqlParameterSource params = new MapSqlParameterSource("username",
				username);
		System.out.println("about to check User");
		int count = jdbcTemplate
				.queryForObject(sqlCount, params, Integer.class);
		System.out.println(count);
		return (count != 0 ? true : false);
		/*
		 * public boolean insertIntoUsers(){ MappingSqlQueryWithParameters
		 * <User> param= new }
		 */
	}

	String json;
	ObjectMapper objectMapper = new ObjectMapper();

	public String convertIntoJson(User user) {
		try {
			json = objectMapper.writeValueAsString(user);

		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}

}
