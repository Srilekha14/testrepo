package com.springboot.thymeleaf.controller;

public class PersonForm {
	private String FirstName;
	private String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public PersonForm(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public PersonForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
