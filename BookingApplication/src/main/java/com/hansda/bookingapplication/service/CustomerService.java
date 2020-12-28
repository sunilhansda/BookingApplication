package com.hansda.bookingapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansda.bookingapplication.entity.Customer;
import com.hansda.bookingapplication.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer getCustomer(String name) {
		return customerRepository.findById(name).get();
	}
	
	public List<Customer> getAllCustomers(){
		List customers = new ArrayList();
		customerRepository.findAll().forEach(customers :: add);
		return customers;
	}

	public void updateCustomer(Customer customer, String name) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String name) {
		customerRepository.deleteById(name);
	}
}
