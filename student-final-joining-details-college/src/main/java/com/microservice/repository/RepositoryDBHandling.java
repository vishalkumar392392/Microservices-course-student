package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.model.StudentFinalJoiningDeatils;

public interface RepositoryDBHandling extends JpaRepository<StudentFinalJoiningDeatils, Integer> {

}
