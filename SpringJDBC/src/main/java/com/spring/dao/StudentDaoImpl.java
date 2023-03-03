package com.spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Student;

public class StudentDaoImpl implements StudentDAO{
	
	private JdbcTemplate jdbcTemp;

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(JdbcTemplate jdbcTemp) {
		super();
		this.jdbcTemp = jdbcTemp;
	}

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}

	public int insert(Student student) {
		String q = "insert into student values(?,?,?)";
        int t = this.jdbcTemp.update(q,student.getId(),student.getName(),student.getCity());
		return t;
	}

	public int change(Student student) {
		String q = "update student set name = ?, city = ? where id =? ";
        int t = this.jdbcTemp.update(q,student.getName(),student.getCity(),student.getId());
		return t;
		
	}

	public int del(Student student) {
		String q = "delete from student where id = ? ";
        int t = this.jdbcTemp.update(q,student.getId());
		return t;	
	}

	public Student getStudent(int id) {
	
		String q = "select * from student where id = ? ";
		RowMapper<Student> rowMapperImpl = new RowMapperImpl();
		
        Student s =  this.jdbcTemp.queryForObject(q,rowMapperImpl,id);
		return s;

	}

	public List<Student> getAllStudent() {
		
		String q = "select * from student";
		List<Student> list = this.jdbcTemp.query(q,new RowMapperImpl());
		
		return list;
	}


	

}
