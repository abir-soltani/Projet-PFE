package com.rnta.gpao.service;

import java.util.List;

import com.rnta.gpao.entities.RapportIntervention;

public interface RapportinterService {

	List<RapportIntervention> getAllInter();
	RapportIntervention saveInter(RapportIntervention inter);
	RapportIntervention getInterById(Long id);
	public void Send(String toemail, String content) throws Exception;

}
