package com.ecommerce.service;

import com.ecommerce.model.dto.CustomerDto;
import com.ecommerce.model.entity.Customer;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.util.StringUtil;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;


    public CustomerService (CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    public void createCustomer(CustomerDto customerDto)
    {
        String ad = customerDto.getFirstName();

        String formattedName = StringUtil.formatName(ad);
        customerDto.setFirstName(formattedName);

        this.customerRepository.save(modelMapper.map(customerDto, Customer.class));
    }


}
