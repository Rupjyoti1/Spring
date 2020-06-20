package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//Controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//controller method to process the Html  form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//add a new controller method to read form data and add data  to  the model
	@RequestMapping("/processFormVerisonTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from HTML form
		String theName=request.getParameter("studentName");
		
		//convert to Cap
		theName=theName.toUpperCase();
		
		//create the message
		
		String result="Yo! "+ theName;
		
		model.addAttribute("message",result);
		return "helloworld";
		
	}

	
	@RequestMapping("/processFormVerisonThree")
	public String processFormVerisonThree(@RequestParam("studentName") String theName,Model model) {
		
		//read the request parameter from HTML form
	//	String theName=request.getParameter("studentName");
		
		//convert to Cap
		theName=theName.toUpperCase();
		
		//create the message
		
		String result="Yo! "+ theName;
		
		model.addAttribute("message",result);
		return "helloworld";
		
	}

	
	
}
