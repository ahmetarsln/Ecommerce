package com.ecommerce.controller;

import com.ecommerce.model.dto.CartDto;
import com.ecommerce.service.CartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService)
    {
        this.cartService = cartService;
    }

    @PostMapping("/")
    public CartDto addCart(@RequestBody CartDto cartDto)
    {
        return this.cartService.addCart(cartDto);
    }
}

