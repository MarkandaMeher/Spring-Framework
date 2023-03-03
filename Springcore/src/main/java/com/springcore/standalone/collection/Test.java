package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");
		Person person1 = c.getBean("person",Person.class);
		System.out.println(person1);
	}

}
