package com.rnta.gpao.entities;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Permission {
	
	@Id
	@GeneratedValue
	private Long id ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date ;
	private LocalTime heure_debut ;
	private LocalTime heure_fin ;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="effectif_id")
	private PresenceEffectif effectif ;
	
     public Permission() {
		
	   }
     
     

	public Permission(Date date, LocalTime heure_debut, LocalTime heure_fin, PresenceEffectif effectif) {
		super();
		this.date = date;
		this.heure_debut = heure_debut ;
		this.heure_fin= heure_fin;
		this.effectif = effectif;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	public LocalTime getHeure_debut() {
		return heure_debut;
	}



	public void setHeure_debut(LocalTime heure_debut) {
		this.heure_debut = heure_debut;
	}



	public LocalTime getHeure_fin() {
		return heure_fin;
	}



	public void setHeure_fin(LocalTime heure_fin) {
		this.heure_fin = heure_fin;
	}



	public PresenceEffectif getEffectif() {
		return effectif;
	}

	public void setEffectif(PresenceEffectif effectif) {
		this.effectif = effectif;
	}
	
	
	
	
	
	

}
