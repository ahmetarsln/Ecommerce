package com.ecommerce.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Product")
public class Product extends BaseEntity {

    @Column(name="product_name", length = 50)
    private String productName;

    @Column(name="price")
    private Integer price;

}
