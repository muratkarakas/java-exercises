package com.eteration.demo.annoation;

public class Customer {
	@Required(message = "Name can not be null")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
