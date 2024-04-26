package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnta.gpao.entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {

	List<Stock> findAll();
}
