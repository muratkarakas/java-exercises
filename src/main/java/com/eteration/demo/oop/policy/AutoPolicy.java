package com.eteration.demo.oop.policy;

public class AutoPolicy extends Policy {

	
	
	
	public AutoPolicy(Customer owner) {
		super(owner);
	}

	@Override
	public double getBaseFee() {
		return 150;
	}

	

}
