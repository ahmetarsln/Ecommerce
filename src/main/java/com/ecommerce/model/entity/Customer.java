package com.ecommerce.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Customer")
public class Customer extends BaseEntity {

    @Column(name="first_name", length = 10)
    private String firstName;

    @OneToOne
    private Cart cart;

    @OneToMany
    private Set<Order> listOrder;
}
