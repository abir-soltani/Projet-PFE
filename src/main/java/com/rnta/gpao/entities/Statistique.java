package com.rnta.gpao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Statistique {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	
	private int n5;
	private int n6;
	private int n7;
	private int n8;
	private int n9;
	private int n10;
	private int n11;
	private int n12;
	
	
	public Statistique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}
	public int getN6() {
		return n6;
	}
	public void setN6(int n6) {
		this.n6 = n6;
	}
	public int getN7() {
		return n7;
	}
	public void setN7(int n7) {
		this.n7 = n7;
	}
	public int getN8() {
		return n8;
	}
	public void setN8(int n8) {
		this.n8 = n8;
	}
	public int getN9() {
		return n9;
	}
	public void setN9(int n9) {
		this.n9 = n9;
	}
	public int getN10() {
		return n10;
	}
	public void setN10(int n10) {
		this.n10 = n10;
	}
	public int getN11() {
		return n11;
	}
	public void setN11(int n11) {
		this.n11 = n11;
	}
	public int getN12() {
		return n12;
	}
	public void setN12(int n12) {
		this.n12 = n12;
	}
	
	
	
}
