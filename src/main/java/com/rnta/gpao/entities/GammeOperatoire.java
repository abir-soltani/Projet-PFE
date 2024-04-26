package com.rnta.gpao.entities;

import java.time.LocalTime;
import java.util.Date;
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

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class GammeOperatoire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private Date dateg ;
	private int operation ;
	private String nom_machine ;
	private LocalTime temps_preparation;
	private LocalTime temps_production ;
	private LocalTime temps_nettoyage ;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name = "article_id")
    private Article article;
	/*@OneToMany(mappedBy = "gprods", cascade = {
	        CascadeType.ALL
	    },fetch=FetchType.EAGER)
	    private List <Production> productions;
	*/
	public GammeOperatoire() {
		
	}
	
	public GammeOperatoire(Date dateg, int operation, String nom_machine, LocalTime temps_preparation,
			LocalTime temps_production, LocalTime temps_nettoyage, Article article) {
		super();
		this.dateg = dateg;
		this.operation = operation;
		this.nom_machine = nom_machine;
		this.temps_preparation = temps_preparation;
		this.temps_production = temps_production;
		this.temps_nettoyage = temps_nettoyage;
		this.article = article;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateg() {
		return dateg;
	}
	public void setDateg(Date dateg) {
		this.dateg = dateg;
	}
	public int getNoperation() {
		return operation;
	}
	public void setNoperation(int operation) {
		this.operation = operation;
	}
	public String getNom_machine() {
		return nom_machine;
	}
	public void setNom_machine(String nom_machine) {
		this.nom_machine = nom_machine;
	}
	public LocalTime getTemps_preparation() {
		return temps_preparation;
	}
	public void setTemps_preparation(LocalTime temps_preparation) {
		this.temps_preparation = temps_preparation;
	}
	public LocalTime getTemps_production() {
		return temps_production;
	}
	public void setTemps_production(LocalTime temps_production) {
		this.temps_production = temps_production;
	}
	public LocalTime getTemps_nettoyage() {
		return temps_nettoyage;
	}
	public void setTemps_nettoyage(LocalTime temps_nettoyage) {
		this.temps_nettoyage = temps_nettoyage;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

/*	public List<Production> getProductions() {
		return productions;
	}

	public void setProductions(List<Production> productions) {
		this.productions = productions;
	}
	
	*/
	
	
}
