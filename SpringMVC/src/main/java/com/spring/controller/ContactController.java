package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;
import com.spring.services.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
//		User u = new User();
//		u.setEmail(email);
//		u.setUserName(userName);
//		u.setPassword(password);
		
		System.out.println(user);
		
		model.addAttribute("user",user);
		
		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
		
		
//		System.out.println("Email : "+email);
//		System.out.println("Name : "+userName);
//		System.out.println("Password : "+password);
		
		this.userService.createUser(user);
		
		return "sucess";
	}
	
	
	/*
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			Model model) {
		
		User u = new User();
		u.setEmail(email);
		u.setUserName(userName);
		u.setPassword(password);
		
		System.out.println(u);
		
		model.addAttribute("user",u);
		
		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
		
		
//		System.out.println("Email : "+email);
//		System.out.println("Name : "+userName);
//		System.out.println("Password : "+password);
		
		return "sucess";
	}
*/
}