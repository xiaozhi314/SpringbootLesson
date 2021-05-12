package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getAllStudents() {
		String sql="select id, stu_id, stu_name, gender, age from student;";
		return jdbcTemplate.query(sql, new StudentRowmapper());
	}

	
	private class StudentRowmapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student=new Student();
			student.setId(rs.getInt("id"));
			student.setStu_id(rs.getString("stu_id"));
			student.setStu_name(rs.getString("stu_name"));
			student.setGender(rs.getString("gender"));
			student.setAge(rs.getString("age"));
			return student;
		}
		
	}
	
}
