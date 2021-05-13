package com.example.demo.mapper;

import java.util.List;


import com.example.demo.model.Student;

public interface StudentMapper {
	public List<Student> getAllStudents();
	public Student getSingleStudents(String studentName);
}
