package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/second") Not working...
public class HomeController2 {
	
	@RequestMapping("/home")
	public String home() {
		
		
		return "index2";
	}
	
	

}
