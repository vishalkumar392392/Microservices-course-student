package com.microservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.model.StudentFinalJoiningDeatils;





@FeignClient(name="student-zuul-api-gateway")
@RibbonClient(name = "student-details-microservice")
public interface StudentDetailsProxy {

//	@GetMapping("students/{id}")

	@GetMapping("/student-details-microservice/students/{id}")
	public StudentFinalJoiningDeatils getById(@PathVariable("id") int id) ;
	
}
