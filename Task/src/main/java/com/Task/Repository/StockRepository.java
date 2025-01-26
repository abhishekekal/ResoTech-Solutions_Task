package com.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.Entity.stockInfo;

public interface StockRepository extends JpaRepository<stockInfo, Integer> {

}
