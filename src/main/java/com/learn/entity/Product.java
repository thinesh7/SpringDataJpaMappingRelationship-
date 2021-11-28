package com.learn.entity;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    private Integer productId;
    private String productName;
    private Integer quantity;
    private Double price;
}
