package com.eteration.demo.oop.risk;

public class CreditcardPaymentRisk extends LifeRisk {
	
	private final double limit;

	public CreditcardPaymentRisk(double limit) {
		this.limit = limit;
	}
	
	@Override
	public double getFee() {
		
		return this.limit*0.001;
	}

}
