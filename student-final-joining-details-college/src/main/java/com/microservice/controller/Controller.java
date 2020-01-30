package com.microservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.StudentFinalJoiningDeatils;
import com.microservice.proxy.StudentDetailsProxy;
import com.microservice.repository.RepositoryDBHandling;


@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class Controller {

	
	@Autowired
	private StudentDetailsProxy proxy;
	
	@Autowired
	private RepositoryDBHandling repository;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/finalStudentDetails")
	public List<StudentFinalJoiningDeatils> getFinalDetails() {
		
		
		
		return repository.findAll();
		
	}
	
	@PostMapping("/finalStudentDetails/{id}")
	public StudentFinalJoiningDeatils createStudentFinalJoiningDeatils(@PathVariable int id,@RequestBody StudentFinalJoiningDeatils obj ){
		StudentFinalJoiningDeatils object=null;
		try {
		StudentFinalJoiningDeatils entity = proxy.getById(id);
		logger.info("------------------------------------------------------",proxy);
		logger.info("{}",proxy);
		logger.info("{}",entity);
		 object = new StudentFinalJoiningDeatils(id,obj.getInstituteName(),obj.getFatherName()
				,obj.getMotherName(),obj.getPostalCode(),
				entity.getFirstName(),
				entity.getLastName(),entity.getDateOfBirth(),
				entity.getClassName(),entity.getPort()
				);
		}
		catch(Exception e) {
			
		}
		 repository.save(object);
	
		
		return object;
		
		
		
	}
	
	@GetMapping("/finalStudentDetails/{id}")
	public Optional<StudentFinalJoiningDeatils> getById(@PathVariable int id ) {
		
		return repository.findById(id);
		
	}
}
