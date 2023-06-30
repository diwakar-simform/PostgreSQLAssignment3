package com.postgresql.assignment2.controller;

import com.postgresql.assignment2.entity.Fruit;
import com.postgresql.assignment2.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fruits")
@RestController
public class FruitController {

    @Autowired
    FruitService fruitService;

    @GetMapping
    public List<Fruit> getAllFruits(){
        return fruitService.getAllFruits();
    }

    @PostMapping
    public Fruit addFruit(@RequestBody Fruit fruit){
        return fruitService.addFruit(fruit);
    }

    @DeleteMapping("/{fruitId}")
    public void deleteFruit(@PathVariable int fruitId){
        fruitService.deleteFruit(fruitId);
    }
}
