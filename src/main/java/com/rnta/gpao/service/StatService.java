package com.rnta.gpao.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnta.gpao.entities.Statistique;
import com.rnta.gpao.repository.StatRepository;

@Service
public class StatService {

	    @Autowired 
	     private StatRepository repository ;
	public List<Statistique> getAll() {
		
		return repository.findAll();
	}


	
}
