package com.balaji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.balaji.model.Student;
import com.balaji.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAll")
	public ModelAndView sayHello() {
		return new ModelAndView("getAllStudents");
	}
	
	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	
	@RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
	public String saveStudent(Student student) {
		studentService.add(student);
		return "success";
		
	}

}
