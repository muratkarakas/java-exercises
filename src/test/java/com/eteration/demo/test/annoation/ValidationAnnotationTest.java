package com.eteration.demo.test.annoation;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.eteration.demo.annoation.Customer;
import com.eteration.demo.annoation.ValidationUtil;

public class ValidationAnnotationTest {

	@Test
	public void validateEntity() throws IllegalAccessException {
		Customer invalidCustomer = new Customer();

		Customer validCustomer = new Customer();
		validCustomer.setName("Naci");

		Map<String, String> validationResults = ValidationUtil.validate(invalidCustomer);

		Assert.assertEquals(1, validationResults.size());

		validationResults = ValidationUtil.validate(validCustomer);

		Assert.assertEquals(0, validationResults.size());

	}

}
