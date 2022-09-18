package com.edu.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.mvc.entities.Student;
import com.edu.mvc.services.MyService;

@Controller
public class Mycontroller {
	
	@Autowired
	private MyService ser;

	@RequestMapping("/Home")
	public String homepage()
	{
		return "Home";
		
	}
	@RequestMapping("/app")
	public String page()
	{
		System.out.println("hello");
		return "app_form";
		
	}
	
	
	@RequestMapping(path="/form1",method=RequestMethod.POST)
	public String test(@ModelAttribute Student st)
	{
		this.ser.tosave(st);
		return "ty";
		
	}
	
	
	
}
