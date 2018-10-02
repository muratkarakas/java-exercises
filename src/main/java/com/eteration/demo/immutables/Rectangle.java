package com.eteration.demo.immutables;

import java.util.Date;

public final class Rectangle {

	private final double width;
	private final double heigth;
	private final Date creationDate;

	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
		creationDate = new Date();
	}

	public double getWidth() {
		return width;
	}

	public double getHeigth() {
		return heigth;
	}

	public Date getCreationDate() {
		return new Date(creationDate.getTime());
	}

	public double area() {
		return heigth * width;
	}

}
