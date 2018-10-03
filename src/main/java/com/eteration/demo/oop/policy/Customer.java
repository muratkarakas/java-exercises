package com.eteration.demo.oop.policy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String lastName;
	private String birthDate;
	private int id;
	private List<Policy> policies = new  ArrayList<>();
	
	
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

	public List<Policy> getPolicies() {
		return policies;
	}

	public void addPolicy(Policy policy) {
		policies.add(policy);
	}

}
