package com.ecommerce.model.entity;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Product")
public class ProductItem extends BaseEntity{

    private Integer quantity;

    private Double priceDecimal;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;
}
