package com.spring.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;
	private String s_name;
	private String s_degree;
	private String s_city;
	private String s_course;
	
	public Student2(int s_id, String s_name, String s_degree, String s_city, String s_course) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_degree = s_degree;
		this.s_city = s_city;
		this.s_course = s_course;
	}

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_degree() {
		return s_degree;
	}

	public void setS_degree(String s_degree) {
		this.s_degree = s_degree;
	}

	public String getS_city() {
		return s_city;
	}

	public void setS_city(String s_city) {
		this.s_city = s_city;
	}

	public String getS_course() {
		return s_course;
	}

	public void setS_course(String s_course) {
		this.s_course = s_course;
	}

	@Override
	public String toString() {
		return "Student2 [s_id=" + s_id + ", s_name=" + s_name + ", s_degree=" + s_degree + ", s_city=" + s_city
				+ ", s_course=" + s_course + "]";
	}
	
	
}