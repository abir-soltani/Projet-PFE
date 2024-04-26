package com.rnta.gpao.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnta.gpao.entities.Atelier;
import com.rnta.gpao.repository.AtelierRepository;
@Service
public class AtelierServiceImpl implements AtelierService {

	@Autowired
	private AtelierRepository atelierRepository;
	@Override
	public Atelier saveAtelier(Atelier a) {
		return atelierRepository.save(a);
	}
	@Override
	public Atelier updateAtelier(Atelier a) {
		return  atelierRepository.save(a);
	}
	@Override
	public void deleteAtelier(Atelier a) {
		atelierRepository.delete(a);
		
	}
	@Override
	public void deleteAtelierById(Long id) {
		atelierRepository.deleteById(id);
		
	}
	@Override
	public Atelier getAtelier(Long id) {
		return atelierRepository.findById(id).get();}
	@Override
	public List<Atelier> getAllAteliers() {
		return atelierRepository.findAll();
	}
	@Override
	public Atelier getAtelierById(Long id) {
		Optional<Atelier> optional = atelierRepository.findById(id);
		Atelier article = null;
		if(optional.isPresent()) {
			article =  optional.get();
		}else {
			throw new RuntimeException("atelier n'est pas trouvée par l'id ::"+ id);
		}
		return article;
	}

}
