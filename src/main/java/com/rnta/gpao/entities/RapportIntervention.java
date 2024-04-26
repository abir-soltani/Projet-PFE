package com.rnta.gpao.entities;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RapportIntervention {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
     private String nomintervenant ;
     private LocalTime heureintervention ;
     private LocalTime dureeintervention ;
     private String piecerechange ;
     private String nature ;
     private String nommachine ;
     private String nomatelier ;
     
     
     
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomintervenant() {
		return nomintervenant;
	}
	public void setNomintervenant(String nomintervenant) {
		this.nomintervenant = nomintervenant;
	}
	public LocalTime getHeureintervention() {
		return heureintervention;
	}
	public void setHeureintervention(LocalTime heureintervention) {
		this.heureintervention = heureintervention;
	}
	public LocalTime getDureeintervention() {
		return dureeintervention;
	}
	public void setDureeintervention(LocalTime dureeintervention) {
		this.dureeintervention = dureeintervention;
	}
	public String getPiecerechange() {
		return piecerechange;
	}
	public void setPiecerechange(String piecerechange) {
		this.piecerechange = piecerechange;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getNommachine() {
		return nommachine;
	}
	public void setNommachine(String nommachine) {
		this.nommachine = nommachine;
	}
	public String getNomatelier() {
		return nomatelier;
	}
	public void setNomatelier(String nomatelier) {
		this.nomatelier = nomatelier;
	}
	
  
     
}