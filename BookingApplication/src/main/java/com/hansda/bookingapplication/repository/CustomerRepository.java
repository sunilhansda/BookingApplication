package com.hansda.bookingapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.hansda.bookingapplication.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
