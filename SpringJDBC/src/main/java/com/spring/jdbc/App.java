package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDAO;
import com.spring.dao.StudentDaoImpl;
import com.spring.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        StudentDAO studentDAO = context.getBean("studentDao",StudentDAO.class);
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext("com/spring/jdbc");
    	StudentDAO studentDAO = context.getBean("studentDao",StudentDAO.class);
    	
//        
//        Student s = new Student();
//        s.setId(301);
//        s.setName("Piyush");
//        s.setCity("Punjab");
//        
//        System.out.println(studentDAO.insert(s));
        
//        Student s = new Student();
//        s.setId(223);
//        s.setName("Rupesh");
//        s.setCity("lathor");
//        
//        System.out.println(studentDAO.change(s));
//        
//        
        
//        Student s = new Student();
//        s.setId(103);
//        System.out.println(studentDAO.del(s));
        
//        System.out.println(studentDAO.getStudent(301));
        
        List<Student> l = studentDAO.getAllStudent();
        for(Student s : l) {
        	System.out.println(s);
        }
        
        
    }
}
