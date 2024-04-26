package com.rnta.gpao.service;

import java.util.List;


import com.rnta.gpao.entities.PresenceEffectif;

public interface EffectifService {

	List<PresenceEffectif> getAllPresenceEffectif();
	PresenceEffectif savePresenceEffectif(PresenceEffectif atelier);
	PresenceEffectif getPresenceEffectifById(Long id);
	PresenceEffectif updatePresenceEffectif(PresenceEffectif effectif);
	

}
