package com.rnta.gpao.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	private int stockinitiale ;
	private int reception ;
	private int consommation ;
	private int stockfinal ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datestock ;
	@ManyToOne
	private Atelier astock;
	public Stock() {
	}
	
	
	public Stock(int stockinitiale, int reception, int consommation, int stockfinal, Date datestock) {
		super();
		this.stockinitiale = stockinitiale;
		this.reception = reception;
		this.consommation = consommation;
		this.stockfinal = stockfinal;
		this.datestock = datestock;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getStockinitiale() {
		return stockinitiale;
	}
	public void setStockinitiale(int stockinitiale) {
		this.stockinitiale = stockinitiale;
	}
	public int getReception() {
		return reception;
	}
	public void setReception(int reception) {
		this.reception = reception;
	}
	public int getConsommation() {
		return consommation;
	}
	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}
	public int getStockfinal() {
		return stockfinal;
	}
	public void setStockfinal(int stockfinal) {
		this.stockfinal = stockfinal;
	}


	public Date getDatestock() {
		return datestock;
	}


	public void setDatestock(Date datestock) {
		this.datestock = datestock;
	}
	
	
	
	

}
