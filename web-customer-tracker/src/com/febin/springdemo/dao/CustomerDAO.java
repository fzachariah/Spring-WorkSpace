package com.febin.springdemo.dao;

import java.util.List;

import com.febin.springdemo.entity.Customer;

public interface CustomerDAO {

	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
