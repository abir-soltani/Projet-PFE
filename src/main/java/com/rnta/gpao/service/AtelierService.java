package com.rnta.gpao.service;

import java.util.List;

import com.rnta.gpao.entities.Atelier;

public interface AtelierService {

	/*List<Atelier> getAllAtelier();
	Atelier saveAtelier(Atelier atelier);
	Atelier getAtelierById(long id);
	void deleteAtelierById(long id);*/
	Atelier saveAtelier(Atelier a);
	Atelier updateAtelier(Atelier a);
	 void deleteAtelier(Atelier a);
     void deleteAtelierById(Long id);
     Atelier getAtelier(Long id);
	 List<Atelier> getAllAteliers();
	 Atelier getAtelierById(Long id);
}
