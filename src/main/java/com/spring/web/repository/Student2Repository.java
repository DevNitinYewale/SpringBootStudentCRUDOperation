package com.spring.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.web.model.Student2;

public interface Student2Repository extends JpaRepository<Student2, Integer>{

	@Query("select stud2 from Student2 stud2 where stud2.name=?1")
	public List<Student2> DisplayByName(String name);
}
