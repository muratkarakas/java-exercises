package com.eteration.demo.test.enums;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.eteration.demo.enums.Color;
import com.eteration.demo.enums.Operation;

public class EnumTest {
	
	

	@Test
	public void calculateTest() throws IllegalAccessException {
		double result = Operation.PLUS.calculate(1, 2);
	        

		Assert.assertTrue(3==result);
		
		
		result = Operation.MINUS.calculate(1, 2);
        

		Assert.assertTrue(-1==result);
		
		
		result = Operation.DIVIDE.calculate(4, 2);
        

		Assert.assertTrue(2==result);
		
		
		result = Operation.TIMES.calculate(3, 2);
        

		Assert.assertTrue(6==result);

	}


	@Test
	public void colorTest() throws IllegalAccessException {
        EnumSet<Color> allColors = EnumSet.of(Color.RED, Color.GREEN);

        

		Assert.assertTrue(allColors.contains(Color.RED));
		Assert.assertTrue(allColors.contains(Color.GREEN));
		Assert.assertFalse(allColors.contains(Color.BLUE));

	}
	
	
	
}
