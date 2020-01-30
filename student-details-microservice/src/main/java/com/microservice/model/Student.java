package com.microservice.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth")
	private LocalDateTime dateOfBirth;
	
	@Column(name="class_name")
	private Integer className;
	@Column(name="port")
	private String port;

	public Student() {
			}



	

   

	public Student(String firstName, String lastName, LocalDateTime dateOfBirth, Integer className, String port) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.className = className;
		this.port = port;
	}







	public String getPort() {
		return port;
	}







	public void setPort(String port) {
		this.port = port;
	}







	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getClassName() {
		return className;
	}

	public void setClassName(Integer className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", className=" + className
				+ "]";
	}
	
	
	
	

}
