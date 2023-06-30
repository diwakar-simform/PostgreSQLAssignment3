package com.postgresql.assignment2.entity.view;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Getter
@Immutable
@Entity(name = "v_fruit_price_greater_100")
public class FruitView {
    @Id
    private int fruitId;
    private String fruitName;
    private int fruitQuantity;
    private int fruitPrice;
}
