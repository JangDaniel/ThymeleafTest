package com.csbon.daniel1.demo.service;

import com.csbon.daniel1.demo.model.Customer;
import com.csbon.daniel1.demo.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private static CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(final Integer id) {
        return customerRepository.findById(id);
    }
}
