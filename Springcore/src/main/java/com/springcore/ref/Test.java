package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A a = (A) c.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		
		System.out.println(a);
	}

}
