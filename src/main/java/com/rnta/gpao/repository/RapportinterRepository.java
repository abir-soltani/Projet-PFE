package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rnta.gpao.entities.RapportIntervention;

@Repository
public interface RapportinterRepository extends JpaRepository<RapportIntervention,Long>{
	
	List<RapportIntervention> findAll();
}
