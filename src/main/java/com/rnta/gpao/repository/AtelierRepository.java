package com.rnta.gpao.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.Atelier;

@Repository
public interface AtelierRepository extends JpaRepository<Atelier,Long>{


}
