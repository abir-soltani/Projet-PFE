package com.rnta.gpao.entities;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String username ;
	private String password ;
	private String nom ;
	private String prenom;
	private String role ;
/*	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	private List <Atelier> ateliers;*/
	
	/* @OneToMany(mappedBy = "usersrec", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	private List <Reclamation> */
 /* @OneToMany(mappedBy = "presenceseff", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	private List <PresenceEffectif> presences;*/
	public User() {
		super();
	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
