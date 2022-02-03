package com.kudamachingauta.nmbapp.services.impl;

import com.kudamachingauta.nmbapp.dao.CustomerRepository;
import com.kudamachingauta.nmbapp.models.Branch;
import com.kudamachingauta.nmbapp.models.Customer;
import com.kudamachingauta.nmbapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public String createCustomer(Customer customer) {
        return null;
    }

    @Override
    public String updateCustomer(Customer branch) {
        return null;
    }

    @Override
    public String deleteCustomer(Long id) {
        return null;
    }

    @Override
    public List<Branch> getAllCustomers() {
        return null;
    }

    @Override
    public Branch getCustomer(Long id) {
        return null;
    }

    @Override
    public Customer findByUsername(String username) {
        return null;
    }
}
