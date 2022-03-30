package com.spring.web.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.web.model.Student2;
import com.spring.web.repository.Student2Repository;

@Service
@Transactional
public class Student2Service {
	
	@Autowired
	Student2Repository stud2Repo;
	
	//DISPLAY ALL RECORDS
	public List<Student2> getAllStudent(){
		
		return stud2Repo.findAll();
	}
	
	//INSERT STUDENT RECORDS
	public void saveStudent2(Student2 student2) {
			stud2Repo.save(student2);
	}
	
	//DELETE STUDENT RECORD BY ID
	public void deleteStudent2(Integer id) {
		stud2Repo.deleteById(id);
	}
	
	//DISPLAY STUDENT BY ID
	
	public Optional<Student2> displayStudent2ById(Integer id){
		
		return stud2Repo.findById(id);
	}

	
	public List<Student2> getStudent2ByName(String name){
		return stud2Repo.DisplayByName(name);
	}
}
