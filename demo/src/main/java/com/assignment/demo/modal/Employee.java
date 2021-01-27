package com.assignment.demo.modal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
@Entity
@Table(name = "Employee")
public class Employee {
@Id
@GeneratedValue
	private String id;
private String empId;
private String firstName;
private String lastName;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
private String dob;
private String password;
private String address;
private String company;
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
private String role;
public String getId() {
	return id;
}
public void setId(String id) {
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
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

}
