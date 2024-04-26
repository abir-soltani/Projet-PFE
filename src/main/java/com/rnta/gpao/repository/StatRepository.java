package com.rnta.gpao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.Statistique;
@Repository
public interface StatRepository  extends JpaRepository<Statistique,Long>{

}
