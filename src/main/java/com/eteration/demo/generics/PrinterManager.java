package com.eteration.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager<T extends Printable> {
	
	
	private List<T> data = new ArrayList<>();
	
	
	
	public void add(T item){
		this.data.add(item);
	}
	
	
	public void addAll(List<T> items){
		data.addAll(items);
	}

	
	public String print(){
		StringBuilder sb = new  StringBuilder();
		
		for (T t : data) {
			sb.append(t.getContent());
		}
		
		return sb.toString();
	}

}
