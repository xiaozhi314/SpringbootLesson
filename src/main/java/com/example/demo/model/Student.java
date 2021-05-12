package com.example.demo.model;


public class Student {
	
	private Integer id;
	private String stu_id;
	private String stu_name;
	private String gender;
	private String age;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(Integer id, String stu_id, String stu_name, String gender, String age) {
		super();
		this.id = id;
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stu_id=" + stu_id + ", stu_name=" + stu_name + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	

}
