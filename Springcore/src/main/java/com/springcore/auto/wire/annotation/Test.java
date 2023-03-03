package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");
		Employee e1 = (Employee) c.getBean("employee");
		System.out.println(e1);
		
	}

}
