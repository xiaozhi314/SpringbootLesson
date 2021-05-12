package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String name() {
		List<Student> list=studentService.getAllStudents();
		
		for (Student student : list) {
			System.out.println(student.toString());
		}
		return "NewFile";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		studentService.inserStudent();
		return "insert";
	}
	
}
