package com.rnta.gpao.entities;

import java.time.LocalTime;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reclamation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date daterec ;
	private String toemail ;
	private String nomreclameur;
	private String nomatelier;
	private String nommachine;
	private String causesarret;
	private LocalTime heurearret;
	private String message;
	@ManyToOne
	private User usersrec ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomreclameur() {
		return nomreclameur;
	}
	public void setNomreclameur(String nomreclameur) {
		this.nomreclameur = nomreclameur;
	}
	public String getNomatelier() {
		return nomatelier;
	}
	public void setNomatelier(String nomatelier) {
		this.nomatelier = nomatelier;
	}
	public String getNommachine() {
		return nommachine;
	}
	public void setNommachine(String nommachine) {
		this.nommachine = nommachine;
	}
	public String getCausesarret() {
		return causesarret;
	}
	public void setCausesarret(String causesarret) {
		this.causesarret = causesarret;
	}
	public LocalTime getHeurearret() {
		return heurearret;
	}
	public void setHeurearret(LocalTime heurearret) {
		this.heurearret = heurearret;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToemail() {
		return toemail;
	}
	public void setToemail(String toemail) {
		this.toemail = toemail;
	}
	public Date getDaterec() {
		return daterec;
	}
	public void setDaterec(Date daterec) {
		this.daterec = daterec;
	}
	public User getUsersrec() {
		return usersrec;
	}
	public void setUsersrec(User usersrec) {
		this.usersrec = usersrec;
	}
	
	
	
	

}
