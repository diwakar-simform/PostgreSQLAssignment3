package com.postgresql.assignment2.service;

import com.postgresql.assignment2.entity.Fruit;

import java.util.List;

public interface FruitService {
    public List<Fruit> getAllFruits();
    public Fruit addFruit(Fruit fruit);
    public void deleteFruit(int fruitId);
}
