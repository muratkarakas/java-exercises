package com.eteration.demo.enums;

public enum Color {
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
	private int r;
	private int g;
	private int b;

	private Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}
	
	
	
}
