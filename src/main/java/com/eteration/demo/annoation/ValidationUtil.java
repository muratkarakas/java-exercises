package com.eteration.demo.annoation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class ValidationUtil {
	
	private ValidationUtil() {
	}
	
	public static Map<String,String> validate(Object obj) throws  IllegalAccessException {
		
		Field[] fields = obj.getClass().getDeclaredFields();
		Map<String,String> validationResult = new HashMap<>();
		for(Field f: fields){
			Required r = f.getAnnotation(Required.class);
			f.setAccessible(true);
			Object fValue = f.get(obj);
			if(r != null && fValue==null) {
				System.out.println("Value for field: " +f +" - "+ r.message());
				validationResult.put(f.getName(), r.message());
			}
			
		}
		
		return validationResult;
		
	}

}
