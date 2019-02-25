package com.eteration.demo.generics;

public class Newspaper implements Printable {
	private String author;
	private String text;
	private String name;

	public Newspaper(String text) {
		super();
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getContent() {
		return text +" printed";
	}

}
