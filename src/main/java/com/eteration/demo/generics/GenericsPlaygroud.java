package com.eteration.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPlaygroud {

	public static void main(String[] args) {
		
		
		
		/* Assign Rules */
		
		List<? extends Number> foo1 = new ArrayList<Number>(); // Number "extends" Number (in this context)
		List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo3 = new ArrayList<Double>(); // Integer extends Number

		List<? super Integer> foo4 = new ArrayList<Integer>(); // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo5 = new ArrayList<Number>(); // Number is a superclass of Integer
		List<? super Integer> foo6 = new ArrayList<Object>(); // Object is a superclass of Number
		
		
		
		/* PECS*/
		
		

		List<? extends Printable> producer = new ArrayList<>();
		read(producer);


		List<? super Printable> consumer = new ArrayList<>();

		write(consumer);


		List<Printable> consumerproducer = new ArrayList<>();
		consumerproducer.add(new Book("content"));

		readAndWrite(consumerproducer);

		copyPrintables(consumer, producer);



		/* Generic Classes */
		

		PrinterManager<Book> bookPrinter = new PrinterManager<>();
		
		PrinterManager<Newspaper> newspaperPrinter = new PrinterManager<>();
		
		Book book = new Book("JS The Good Parts");
		
		Newspaper newspaper = new Newspaper("Daily news");

		bookPrinter.add(book);
		
		newspaperPrinter.add(newspaper);
		
		// bookPrinter.add(newspaper); // not valid, different types. rule:"T extends Printable",

		
	}

	private static void read(List<? extends Printable> printables) {
		// printables.add(new Book("Good Book")); // not valid because list definition may not be book
		System.out.println(printables.get(0).getContent());
	}

	private static void write(List<? super Printable> printables) {
		Object printable = printables.get(0);// only read as object because it's guaranteed to cast
		printables.add(new Book("Good Book"));

	}

	private static void readAndWrite(List<Printable> printables) {

		printables.add(new Book("Good Book"));
		System.out.println(printables.get(0).getContent());
	}

	public static <T> void copyPrintables(List<? super T> dest, List<? extends T> src) {

		for (T t : src) {
			dest.add(t);
		}

	}

}
