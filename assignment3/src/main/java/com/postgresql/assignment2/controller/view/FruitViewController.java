package com.postgresql.assignment2.controller.view;

import com.postgresql.assignment2.entity.view.FruitView;
import com.postgresql.assignment2.service.view.FruitViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/fruitview")
@RestController
public class FruitViewController {
    @Autowired
    FruitViewService fruitViewService;

    @GetMapping
    public List<FruitView> getAllFruitView(){
        return fruitViewService.getAllFruitView();
    }
}
