package com.byn.stickynotes.dao;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/stickynotes-servlet.xml")
public class UserDaoTest {
	@Autowired
	private DataSource dataSource;
	@Test
	public void dataSourceNotNull(){
		assertNotNull(dataSource);
	}

}
