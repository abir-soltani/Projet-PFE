package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnta.gpao.entities.PresenceEffectif;

public interface EffectifRepository extends  JpaRepository<PresenceEffectif, Long>{

	List<PresenceEffectif> findAll();

}
