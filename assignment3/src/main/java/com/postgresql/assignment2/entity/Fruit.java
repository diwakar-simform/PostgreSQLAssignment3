package com.postgresql.assignment2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fruitId;
    private String fruitName;
    private int fruitQuantity;
    private int fruitPrice;
}
