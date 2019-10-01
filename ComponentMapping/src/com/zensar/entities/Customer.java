package com.zensar.entities;

import java.sql.Blob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

/**
 * @author Mokshi Vyas
 * @creation date: 26 sep 19 2:55 pm
 * @modification date: 26 sep 19 2:55pm
 * @version 1.0
 * @description This is persistent class
 * 
 * @copyright Zensar Technologies. All rights reserved.
 *
 */
@Entity
@Table(name = "customer")
public class Customer {
@Id
@Column(name = "CId")
private int customerId;
private Name customerName;
private String gender;
private int age;
@Column(nullable = false)
private String address;
private LocalDate birthDate;
private Blob profilePhoto;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Blob getProfilePhoto() {
	return profilePhoto;
}

public void setProfilePhoto(Blob profilePhoto) {
	this.profilePhoto = profilePhoto;
}

public LocalDate getBirthDate() {
	return birthDate;
}

public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

public Customer() {
	// TODO Auto-generated constructor stub
}



public Customer(int customerId, Name customerName, String gender, int age, String address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.gender = gender;
	this.age = age;
	this.address = address;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public Name getCustomerName() {
	return customerName;
}

public void setCustomerName(Name customerName) {
	this.customerName = customerName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", age="
			+ age + ", address=" + address + "]";
}



}



