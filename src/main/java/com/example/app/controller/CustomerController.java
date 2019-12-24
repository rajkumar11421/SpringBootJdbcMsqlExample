package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Customer;
import com.example.app.repository.CustomerDAO;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/getcustInfo")
    public List<Customer> customerInformation() {
        List<Customer> customers = customerDAO.isData(); 
        return customers;
    }

}
