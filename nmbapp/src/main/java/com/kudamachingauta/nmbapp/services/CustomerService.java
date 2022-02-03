package com.kudamachingauta.nmbapp.services;

import com.kudamachingauta.nmbapp.models.Branch;
import com.kudamachingauta.nmbapp.models.Customer;

import java.util.List;

public interface CustomerService {
    String createCustomer(Customer customer);
    String updateCustomer(Customer branch);
    String deleteCustomer(Long id);
    List<Branch> getAllCustomers();
    Branch getCustomer(Long id);
    Customer findByUsername(String username);
}
