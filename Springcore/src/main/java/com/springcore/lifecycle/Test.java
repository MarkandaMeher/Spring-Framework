package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
		
		
		//Using XML
//		Samosa s = (Samosa) c.getBean("samosa");
//		System.out.println(s);
//		c.registerShutdownHook();
		
		
		//Using Spring Interfaces
//		Pepsi p = (Pepsi) c.getBean("pepsi");
//		System.out.println(p);
		
		Example e1 = (Example) c.getBean("example");
		System.out.println(e1);
		
	}

}
