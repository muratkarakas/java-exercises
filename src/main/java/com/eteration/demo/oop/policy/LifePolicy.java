package com.eteration.demo.oop.policy;

public class LifePolicy extends Policy {

	public LifePolicy(Customer owner) {
		super(owner);
	}

	@Override
	public double getBaseFee() {
		return 100;
	}

}
