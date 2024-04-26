package com.rnta.gpao.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Machine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String codeMachine;
	private String nomMachine;
	private String typeMachine;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "atelier")
    private Atelier atelier;
	/*@OneToMany(mappedBy = "mprods", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
	    private List <Production> productions;*/
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodeMachine() {
		return codeMachine;
	}
	public void setCodeMachine(String codeMachine) {
		this.codeMachine = codeMachine;
	}
	public String getNomMachine() {
		return nomMachine;
	}
	public void setNomMachine(String nomMachine) {
		this.nomMachine = nomMachine;
	}
	public String getTypeMachine() {
		return typeMachine;
	}
	public void setTypeMachine(String typeMachine) {
		this.typeMachine = typeMachine;
	}
	
	}
	
	
	


