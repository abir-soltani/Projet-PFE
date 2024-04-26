package com.rnta.gpao.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="effectif")
public class PresenceEffectif {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
    private String matricule ;
    private String nomprenom ;
    private String Etat ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateAjout ;
	/*@OneToMany(mappedBy = "effectif", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	private List<Permission> permissions ;*/
	@ManyToOne
	private User prsenceseff;
	
	public PresenceEffectif() {
		
	}
	
	public PresenceEffectif(Long id, String matricule, String nomprenom, String etat, Date dateAjout) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.nomprenom = nomprenom;
		Etat = etat;
		this.dateAjout = dateAjout;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNomprenom() {
		return nomprenom;
	}
	public void setNomprenom(String nomprenom) {
		this.nomprenom = nomprenom;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

/*	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public User getPrsenceseff() {
		return prsenceseff;
	}

	public void setPrsenceseff(User prsenceseff) {
		this.prsenceseff = prsenceseff;
	}
	*/
	
	
	
}
