package com.rnta.gpao.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Atelier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String nomAtelier;
	private String sectionHomogene;

	@OneToMany(mappedBy = "atelier", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	    private List <Machine> machine;
	@ManyToOne
	private User users ;
/*	@OneToMany(mappedBy = "astock", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	    private List <Stock> stocks;*/
	
	public Atelier() {
	}
	
	public Atelier(String nomAtelier, String sectionHomogene) {
		super();
		this.nomAtelier = nomAtelier;
		this.sectionHomogene = sectionHomogene;}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomAtelier() {
		return nomAtelier;
	}
	public void setNomAtelier(String nomAtelier) {
		this.nomAtelier = nomAtelier;
	}
	public String getSectionHomogene() {
		return sectionHomogene;
	}
	public void setSectionHomogene(String sectionHomogene) {
		this.sectionHomogene = sectionHomogene;
	}

	public List<Machine> getMachine() {
		return machine;
	}

	public void setMachine(List<Machine> machine) {
		this.machine = machine;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	/*public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	*/

}
