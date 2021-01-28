package com.assignment.demo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
@Entity
@Table(name = "Manager")
public class Manager {
	@Id
	@GeneratedValue
private String id;
	private String email;
private String firstName;
private String lastName;
private String dob;
private String password;
private String address;
private String company;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String city;
private String mobile;
private String role;
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

}
