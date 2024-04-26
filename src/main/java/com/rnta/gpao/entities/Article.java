package com.rnta.gpao.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private Date datea;
	private String codeinfo;
	private String designationfou ;
	private String unite ;
	/*@OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
    @JsonIgnore
    private List<GammeOperatoire> gammes;*/
	
	
	public Article() {
		
	}
	

	public Article(Date datea, String codeinfo, String designationfou, String unite) {
		super();
		this.datea = datea;
		this.codeinfo = codeinfo;
		this.designationfou = designationfou;
		this.unite = unite;
		
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/*public List<GammeOperatoire> getGammes() {
		return gammes;
	}
	public void setGammes(List<GammeOperatoire> gammes) {
		this.gammes = gammes;
	}*/
	public String getCodeinfo() {
		return codeinfo;
	}
	public void setCodeinfo(String codeinfo) {
		this.codeinfo = codeinfo;
	}
	public String getDesignationfou() {
		return designationfou;
	}
	public void setDesignationfou(String designationfou) {
		this.designationfou = designationfou;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public Date getDatea() {
		return datea;
	}
	public void setDatea(Date datea) {
		this.datea = datea;
	}
	
	
	
	
	
}
