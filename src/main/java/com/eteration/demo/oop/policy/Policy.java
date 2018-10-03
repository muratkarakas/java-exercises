package com.eteration.demo.oop.policy;

import java.util.ArrayList;
import java.util.List;

import com.eteration.demo.oop.risk.Risk;

public abstract class Policy implements Cloneable {
	
	private Customer owner;

	private List<Risk> risks = new ArrayList<>();

	public Customer getOwner() {
		return owner;
	}

	public Policy(Customer owner) {
		super();
		this.owner = owner;
		owner.addPolicy(this);
	}

	public List<Risk> getRisks() {
		return risks;
	}

	public void addRisk(Risk risk) {
		this.getRisks().add(risk);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Policy clone = (Policy) super.clone();
		clone.risks = new ArrayList<Risk>();
		for (Risk risk : risks)
			clone.risks.add(risk);
		return clone;
	}

	public double getPremium() {
		double riskFee = 0;
		for (Risk r : getRisks())
			riskFee += r.getFee();
		return getBaseFee() + riskFee;
	}

	public abstract double getBaseFee();

}
