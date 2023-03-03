package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.ConfirmationCallback;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("Inside home method!!");
		model.addAttribute("name","Piyush Meher");
		model.addAttribute("id",234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Meher");
		friends.add("Rohan");
		friends.add("Navin");
		
		model.addAttribute("f",friends);
		System.out.println("Insie last");
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
	System.out.println("Inside about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Inside help page!!");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Piyush");
		mv.addObject("roll",252);
		mv.setViewName("help");
		
		return mv;
		
	}

}
