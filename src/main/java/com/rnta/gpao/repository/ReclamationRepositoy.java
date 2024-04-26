package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rnta.gpao.entities.Reclamation;



public interface ReclamationRepositoy extends JpaRepository<Reclamation,Long> {
	List<Reclamation> findAll();

}
