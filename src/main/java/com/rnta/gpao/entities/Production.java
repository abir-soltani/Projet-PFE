package com.rnta.gpao.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Production {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id ;
	private String date ;
	private String datep ;
	private String nomMachine ;
	private String  nommach ;
	private String marqueActuel;
	private Date dureepost;
	private String durePost;
	private String durePauses;
	private String productionTotale ;
	private String nbpoduction ;
	private String nbdechets ;
	private String fileType;
	@JsonProperty("analyseArret")
	private String analyseArret ;
	private Date dureeservice ;
	private String dureService ;
	private String dureArrets ;
	@ManyToOne
	private Machine mprods ;
	@ManyToOne
	private GammeOperatoire gprods ;
	
	@Transient
	private MultipartFile file ;

	public Production() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNomMachine() {
		return nomMachine;
	}

	public void setNomMachine(String nomMachine) {
		this.nomMachine = nomMachine;
	}

	public String getMarqueActuel() {
		return marqueActuel;
	}

	public void setMarqueActuel(String marqueActuel) {
		this.marqueActuel = marqueActuel;
	}


	

	public Date getDureepost() {
		return dureepost;
	}

	public void setDureepost(Date dureepost) {
		this.dureepost = dureepost;
	}

	public String getDurePost() {
		return durePost;
	}

	public void setDurePost(String durePost) {
		this.durePost = durePost;
	}

	public String getDurePauses() {
		return durePauses;
	}

	public void setDurePauses(String durePauses) {
		this.durePauses = durePauses;
	}

	public String getProductionTotale() {
		return productionTotale;
	}

	public void setProductionTotale(String productionTotale) {
		this.productionTotale = productionTotale;
	}

	public String getNbdechets() {
		return nbdechets;
	}

	public void setNbdechets(String nbdechets) {
		this.nbdechets = nbdechets;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	


	public String getAnalyseArret() {
		return analyseArret;
	}

	public void setAnalyseArret(String analyseArret) {
		this.analyseArret = analyseArret;
	}

	public Date getDureeservice() {
		return dureeservice;
	}

	public void setDureeservice(Date dureeservice) {
		this.dureeservice = dureeservice;
	}

	public String getDureService() {
		return dureService;
	}

	public void setDureService(String dureService) {
		this.dureService = dureService;
	}

	public String getDureArrets() {
		return dureArrets;
	}

	public void setDureArrets(String dureArrets) {
		this.dureArrets = dureArrets;
	}

	public Machine getMprods() {
		return mprods;
	}

	public void setMprods(Machine mprods) {
		this.mprods = mprods;
	}

	public GammeOperatoire getGprods() {
		return gprods;
	}

	public void setGprods(GammeOperatoire gprods) {
		this.gprods = gprods;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getDatep() {
		return datep;
	}

	public void setDatep(String datep) {
		this.datep = datep;
	}

	

	public String getNommach() {
		return nommach;
	}

	public void setNommach(String nommach) {
		this.nommach = nommach;
	}

	public String getNbpoduction() {
		return nbpoduction;
	}

	public void setNbpoduction(String nbpoduction) {
		this.nbpoduction = nbpoduction;
	}
	
	
	
	

}
