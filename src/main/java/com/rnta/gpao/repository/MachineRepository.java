package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.Machine;

@Repository
public interface MachineRepository extends JpaRepository<Machine,Long>{

	List<Machine> findAll();
	
}
