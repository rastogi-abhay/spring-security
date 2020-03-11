package com.example.japauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/admin")
	public String Admin() {
		
		
		return "admin";
	}

	@RequestMapping("/user")
	public String User() {
		return "user";
	}

}
