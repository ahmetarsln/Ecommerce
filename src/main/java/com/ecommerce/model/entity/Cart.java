package com.ecommerce.model.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cart")
public class Cart extends BaseEntity {

    @OneToOne
    @JoinColumn(unique = true)
    private Customer customer;

    @OneToMany
    private Set<ProductItem> listProductItem;
}
