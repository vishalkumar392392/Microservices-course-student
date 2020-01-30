package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;




@SpringBootApplication
@EnableFeignClients("com.microservice.proxy")
@EnableDiscoveryClient
public class StudentFinalJoiningDetailsCollegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentFinalJoiningDetailsCollegeApplication.class, args);
	}
	


}
