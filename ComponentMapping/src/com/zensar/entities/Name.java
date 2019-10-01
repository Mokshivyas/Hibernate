package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Mokshi Vyas
 * @creation date: 26 sep 19 2.45pm
 * @modification date: 26 sep 19
 * @version 1.0
 * @description 
 * 
 * @copyright Zensar Technologies. All rights reserved.
 *
 */
@Embeddable
public class Name {
	@Column(name = "First",length = 30)
private String firstName;
	@Column(name = "Middle",length = 30)
private String middleName;
private String lastName;

public Name() {
	// TODO Auto-generated constructor stub
}

public Name(String firstName, String middleName, String lastName) {
	super();
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
}

}
