package com.ecommerce.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cart")
public class Cart extends BaseEntity {

    @OneToOne
    private Customer customer;

    @OneToMany
    private Set<ProductItem> listProductItem;
}
