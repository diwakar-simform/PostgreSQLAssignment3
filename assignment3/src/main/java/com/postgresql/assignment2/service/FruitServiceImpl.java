package com.postgresql.assignment2.service;

import com.postgresql.assignment2.entity.Fruit;
import com.postgresql.assignment2.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    FruitRepo fruitRepo;

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepo.findAll();
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepo.save(fruit);
    }

    @Override
    public void deleteFruit(int fruitId) {
        fruitRepo.deleteById(fruitId);
    }
}
