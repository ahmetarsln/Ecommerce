package com.ecommerce.controller;

import com.ecommerce.model.dto.CustomerDto;
import com.ecommerce.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public void createCustomer(@RequestBody CustomerDto customerDto)
    {
        this.customerService.createCustomer(customerDto);
    }
}
