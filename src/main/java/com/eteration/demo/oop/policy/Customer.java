package com.eteration.demo.oop.policy;

public class Customer {
	private String name;
	private String lastName;
	private String birthDate;
	private int id;

	public Customer(String name, String lastName, String birthDate) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
