package com.microservice.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="final_details")
public class StudentFinalJoiningDeatils {
	
	@Id
//	@Column(name="final_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="institute_Name")
	private String instituteName;
	
	@Column(name="father_Name")
	private String fatherName;
	
	@Column(name="mother_Name")
	private String motherName;
	
	@Column(name="postal_Code")
	private int postalCode;
	
//	@JsonIgnore
	@Column(name="first_name")
	private String firstName;
	
//	@JsonIgnore
	@Column(name="last_name")
	private String lastName;
	
//	@JsonIgnore
	@Column(name="date_of_birth")
	private LocalDateTime dateOfBirth;
	
//	@JsonIgnore
	@Column(name="class_name")
	private int className;
	
//	@JsonIgnore
	private String port;

	
	public StudentFinalJoiningDeatils() {
		// TODO Auto-generated constructor stub
	}

	public StudentFinalJoiningDeatils( int id,String instituteName, String fatherName, String motherName, int postalCode,
			String firstName, String lastName, LocalDateTime dateOfBirth, int className, String port) {
		super();
		this.id=id;
		this.instituteName = instituteName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.postalCode = postalCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.className = className;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
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

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getClassName() {
		return className;
	}

	public void setClassName(int className) {
		this.className = className;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "StudentFinalJoiningDeatils [id=" + id + ", instituteName=" + instituteName + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", postalCode=" + postalCode + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", className=" + className + ", port="
				+ port + "]";
	}
	
	
	
	
	
	
	

}
