package com.spring.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.model.Student2;
import com.spring.web.repository.Student2Repository;
import com.spring.web.service.Student2Service;

@RestController
@RequestMapping("/student2")
public class Student2Controller {
	
	@Autowired
	Student2Service stud2Service;
	
	@Autowired
	Student2Repository s2Repo;
	
	//DISPLAY ALL RECORDS 
	@GetMapping("/getAllStudent")
	public List<Student2> list(){
		
		return stud2Service.getAllStudent();
	}
	
	//INSERT RECORDS
	@PostMapping("/")
	public String insertStudent2(@RequestBody Student2 student) {
		stud2Service.saveStudent2(student);
		return "Student2 record inserted.";
	}
	
	//DELETE RECORDS
	
	/* 1
	@DeleteMapping("/{id}")
	public String deleteStudent2(@PathVariable Integer id) {
		try {
			s2Repo.deleteById(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "successfully deleted..";
	}*/
	
	@DeleteMapping("/{id}")
	public String deleteStudent2ById(@PathVariable Integer id) {
		try {
			stud2Service.deleteStudent2(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "student record deleted successfully..!";
	}
	
	//DISPLAY STUDENT BY ID
	
	@GetMapping("/{id}")
	public Optional<Student2> findStudent2ById(@PathVariable Integer id) {
		return stud2Service.displayStudent2ById(id);
	}
	
	
	@GetMapping("/{name}")
	public List<Student2> findStudentByName(@PathVariable String name){
		return stud2Service.getStudent2ByName(name);
	}
	
}
