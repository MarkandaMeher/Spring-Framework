package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.dao.StudentDAO;
import com.spring.dao.StudentDaoImpl;

@Configuration
public class jdbcConfig {
	
	@Bean(name = "ds")
	public DataSource getDataSource() {
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/SpringJDBC");
		dmd.setUsername("root");
		dmd.setPassword("1553");
		
		return dmd;
	}
	
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate ob = new JdbcTemplate();
		ob.setDataSource(getDataSource());
		return ob;
	}
	
	@Bean(name = "studentDao")
	public StudentDAO getStudentDao() {
		StudentDaoImpl obj = new StudentDaoImpl();
		obj.setJdbcTemp(getTemplate());
		return obj;
	}

}
