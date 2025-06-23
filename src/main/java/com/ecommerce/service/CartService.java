package com.ecommerce.service;

import com.ecommerce.model.dto.CartDto;
import com.ecommerce.model.entity.Cart;
import com.ecommerce.model.entity.Customer;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public CartService(CartRepository cartRepository, ModelMapper modelMapper, CustomerRepository customerRepository)
    {
        this.cartRepository = cartRepository;
        this.modelMapper = modelMapper;
        this.customerRepository = customerRepository;
    }


    public CartDto addCart(CartDto cartDto)
    {


        Customer customer = this.customerRepository.findByFirstName(cartDto.getCustomer().getFirstName());

        if (customer.getFirstName() == null)
            throw new IllegalArgumentException("Customer bulunamadı");

        Cart cart = modelMapper.map(cartDto, Cart.class);

        cart.setCustomer(customer);

        cart = this.cartRepository.save(cart);

        customer.setCart(cart);

        this.customerRepository.save(customer);

        return modelMapper.map(cart, CartDto.class);
    }
}
