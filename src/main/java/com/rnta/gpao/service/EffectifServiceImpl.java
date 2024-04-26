package com.rnta.gpao.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnta.gpao.entities.PresenceEffectif;
import com.rnta.gpao.repository.EffectifRepository;

@Service
public class EffectifServiceImpl implements  EffectifService {

	@Autowired
	private EffectifRepository  effectifRepository;

	@Override
	public List<PresenceEffectif> getAllPresenceEffectif() {
		return effectifRepository.findAll();
	}

	@Override
	public PresenceEffectif savePresenceEffectif(PresenceEffectif effectif) {
	
		return effectifRepository.save(effectif);
	}

	@Override
	public PresenceEffectif getPresenceEffectifById(Long id) {
	
		return effectifRepository.findById(id).get();
	}

	@Override
	public PresenceEffectif updatePresenceEffectif(PresenceEffectif effectif) {
		
		return effectifRepository.save(effectif);
	}

	
	
	
}
