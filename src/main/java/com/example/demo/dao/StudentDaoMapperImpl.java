package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;

@Repository
public class StudentDaoMapperImpl implements StudentDao {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentMapper.getAllStudents();
	}

	@Override
	public Student getSingleStudents(String studentName) {
		return studentMapper.getSingleStudents(studentName);
	}

}
