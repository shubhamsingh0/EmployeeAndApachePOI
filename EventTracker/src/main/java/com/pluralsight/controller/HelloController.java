package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model)
	{
		model.addAttribute("greeting","Hello Shubham Singh");
		return "hello";
	}
	
}
