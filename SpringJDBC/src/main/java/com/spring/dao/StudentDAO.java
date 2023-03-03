package com.spring.dao;

import java.util.List;

import com.spring.entities.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int del(Student student);
		
	public Student getStudent(int id);
	
	public List<Student>  getAllStudent();
	

}
