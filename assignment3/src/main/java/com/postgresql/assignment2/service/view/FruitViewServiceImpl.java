package com.postgresql.assignment2.service.view;

import com.postgresql.assignment2.entity.view.FruitView;
import com.postgresql.assignment2.repository.view.FruitViewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitViewServiceImpl implements FruitViewService {

    @Autowired
    FruitViewRepo fruitViewRepo;

    @Override
    public List<FruitView> getAllFruitView() {
        return fruitViewRepo.findAll();
    }
}
