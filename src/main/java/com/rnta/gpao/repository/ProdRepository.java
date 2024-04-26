package com.rnta.gpao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.Production;

@Repository
public interface ProdRepository extends CrudRepository<Production,Long>{

	

}
