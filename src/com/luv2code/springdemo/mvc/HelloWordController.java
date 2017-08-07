package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWordController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloword-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloword";
	}
	
	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter form the HTML form
		String theName = request.getParameter("studentName");
		// convert he data to upper case
		theName = theName.toUpperCase();
		// create the message
		String result = "Yoo! " + theName;
		 // add the message to the model
		model.addAttribute("message", result);
		
		return "helloword";
	}

	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
	
		// convert he data to upper case
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey My friend from V3! " + theName;
		 // add the message to the model
		model.addAttribute("message", result);
		
		return "helloword";
	}
	
}







