package net.javaguides.cms.service;

import java.util.List;

import net.javaguides.cms.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomerById(Long id);
}
