package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/index")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/toStudentPage")
	public String toStudentPage() {
		return "students";
	}
	
	@RequestMapping("/getAllStudents")
	@ResponseBody
	public List<Student> getAllStudent() {
		List<Student> list=studentService.getAllStudents();
		for (Student student : list) {
			System.out.println(student.toString());
		}
		return list;
	}
	
	@RequestMapping("/getSingleStudents")
	@ResponseBody
	public Student getSingleStudents(@RequestParam("studentName")String studentName) {
		Student s = studentService.getSingleStudents(studentName);
		System.out.println(s.toString());
		return s;
	}
}
