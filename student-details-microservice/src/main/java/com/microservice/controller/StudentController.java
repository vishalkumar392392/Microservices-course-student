package com.microservice.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Student;
import com.microservice.repository.StudentRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Environment environment;
	
    List<Student> list = new ArrayList<Student>();
	
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		
//		LocalDateTime date = LocalDateTime.now();
//		Student s1 = new Student("vishal","palla",date,10,environment.getProperty("local.server.port"));
//		Student s2 = new Student("vikas","palla",date,9,environment.getProperty("local.server.port"));
//		Student s3 = new Student("ajith","palla",date,8,environment.getProperty("local.server.port"));
//		
//		list.add(s1);list.add(s2);list.add(s3);
//		
//		studentRepository.saveAll(list);
	return	studentRepository.findAll();

	}
	
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		
		return studentRepository.save(student);
		
	}
	
	@GetMapping("/students/{id}")
	public Student getById(@PathVariable("id") int id) {
		
		 Student student =studentRepository.findById(id).get();
		 
		 student.setPort(environment.getProperty("local.server.port"));
		 
		 return student;
	}
	
	
	
	
	
	
	
	
	
	
}
