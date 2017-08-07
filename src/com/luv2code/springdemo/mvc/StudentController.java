package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
		
		// step 2
@Controller
@RequestMapping("/student")
public class StudentController {
	
	// create method to showing form
	@RequestMapping ("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		
		return "student-form";
	}
	
	
	// define a new method here..(step 4)
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent:" + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-conformation";
		
	}
}



