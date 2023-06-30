package com.postgresql.assignment2.repository.view;

import com.postgresql.assignment2.entity.view.FruitView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitViewRepo extends JpaRepository<FruitView,Integer> {

}

