package com.eteration.demo.test.equalsandhashcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import com.eteration.demo.equalsandhashcode.Customer;

public class HashCodeEqualsTest {

	@Test
	public void checkCustomerDataInArrayList() {
		Customer customer1 = new Customer(1,"murat");
		
		Customer customer2 = new Customer(2,"ali");
		
		Collection<Customer> customers = new ArrayList<>();
		
		
		customers.add(customer1);
		customers.add(customer2);
		
		
		Assert.assertEquals(2, customers.size());

		Assert.assertTrue(customers.contains(new Customer(1,"murat")));;
		
	}
	
	@Test
	public void checkCustomerDataInHashSet() {
		Customer customer1 = new Customer(1,"murat");
		
		Customer customer2 = new Customer(2,"ali");
		
		Collection<Customer> customers = new HashSet<>();
		
		
		customers.add(customer1);
		customers.add(customer2);
		
		
		Assert.assertEquals(2, customers.size());

		Assert.assertTrue(customers.contains(new Customer(1,"murat")));;
		
	}

}
