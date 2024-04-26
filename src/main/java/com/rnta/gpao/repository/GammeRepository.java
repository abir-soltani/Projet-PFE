package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.GammeOperatoire;

@Repository
public interface GammeRepository extends JpaRepository<GammeOperatoire,Long> {

	List<GammeOperatoire> findAll();
}

