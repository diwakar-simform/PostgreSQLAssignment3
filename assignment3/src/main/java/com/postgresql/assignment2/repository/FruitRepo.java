package com.postgresql.assignment2.repository;

import com.postgresql.assignment2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Integer> {

}
