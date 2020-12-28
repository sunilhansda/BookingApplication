package com.hansda.bookingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hansda.bookingapplication.entity.Customer;
import com.hansda.bookingapplication.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	@RequestMapping("/customers/{name}")
	public Customer getCustomer(@PathVariable String name) {
		return customerService.getCustomer(name);
	}
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{name}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String name) {
		customerService.updateCustomer(customer, name);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{name}")
	public void deleteCustomer(@PathVariable String name) {
		customerService.deleteCustomer(name);
	}

}
