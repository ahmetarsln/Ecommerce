package com.ecommerce.model.dto;

import com.ecommerce.model.entity.ProductItem;
import lombok.Data;

import java.util.Set;

@Data
public class CartDto {

    private CustomerDto customer;

    private Set<ProductItem> listProductItem;
}
