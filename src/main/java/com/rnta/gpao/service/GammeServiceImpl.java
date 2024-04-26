package com.rnta.gpao.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rnta.gpao.entities.GammeOperatoire;
import com.rnta.gpao.repository.GammeRepository;
@Service
public class GammeServiceImpl implements GammeService{
	@Autowired
	private  GammeRepository  gammeRepository;
	@Override
	public List<GammeOperatoire> getAllGamme() {
		return gammeRepository.findAll();

	}

	@Override
	public GammeOperatoire saveGamme(GammeOperatoire gamme) {
		if(gamme.getId() != null && gammeRepository.existsById(gamme.getId())) {
			throw new EntityExistsException("There is already existing entity with such ID in the database.");
		}
		return gammeRepository.save(gamme);
	}

	@Override
	public GammeOperatoire getGammeById(Long id) {
		Optional<GammeOperatoire> optional = gammeRepository.findById(id);
		GammeOperatoire gamme = null;
		if(optional.isPresent()) {
			gamme =  optional.get();
		}else {
			throw new RuntimeException("gamme n'est pas trouvée par l'id ::"+ id);
		}
		return gamme;
	}

	@Override
	public void deleteGammeById(Long id) {
		this.gammeRepository.deleteById(id);
	}

	@Override
	public GammeOperatoire updateGamme(GammeOperatoire gamme) {
		return gammeRepository.save(gamme);
	}

}
