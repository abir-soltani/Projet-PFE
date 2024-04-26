package com.rnta.gpao.controller;

import java.util.Arrays;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rnta.gpao.entities.RapportIntervention;

import com.rnta.gpao.service.RapportinterService;
@CrossOrigin(origins = "*")
@RequestMapping("interventions/api")
@Controller
public class RapportinterController {
	@Autowired
	private RapportinterService interService ;
	//display list of ateliers
	/*@GetMapping("/listinter")
	public String viewHomePage(Model model) {
		model.addAttribute("listInters",interService.getAllInter());
       return "listinter";
	}*/
	@ResponseBody
	@RequestMapping(value= "/listerapport" ,method = RequestMethod.GET)
	public List<RapportIntervention> getAllRapportIntervention() {
		return interService.getAllInter();
	 }
	@ResponseBody
/*	@RequestMapping(method = RequestMethod.GET)
	  //create model attribute to bind form data
	public String showNewAtelierForm(Model model){
		RapportIntervention inter = new RapportIntervention();
		model.addAttribute("inter",inter);
		List<String> interList = Arrays.asList("Mécanique","Electrique","Pneum","Hydraul.","Sécurité","Autre");
		model.addAttribute("interList", interList);
		return "";
	}*/
	
	/*@PostMapping("/saveinter")
	public String saveInter(@ModelAttribute("inter") RapportIntervention inter ) {
		//save atelier to databse
		interService.saveInter(inter);
		return "redirect:/listinter";
		
	}*/
	
	@RequestMapping(value="/send", method = RequestMethod.POST)
    public RapportIntervention Send(@RequestBody  RapportIntervention inter) {
	   try {
		String content = "Nom de l'intervenant:" + inter.getNomintervenant();
		    content += "<br> Durée d'intervention:" + inter.getDureeintervention();
	      content += "<br> Heure intervention:" + inter.getHeureintervention();
		 content += "<br> Piéce de rechangee:" + inter.getPiecerechange();
	      content += "<br> Nature :" + inter.getNature();
	      content += "<br> Nom machine :" + inter.getNommachine();
	      content += "<br> Nom atelier :" + inter.getNomatelier();
	     
	      interService.Send("abirsoltani204@gmail.com",content);
	    /* Modelmap.put("msg","Done!");*/
	      interService.saveInter(inter);
	   }catch(Exception e){
		  /* Modelmap.put("errors",e.getMessage());*/
	   }
	     return interService.saveInter(inter);
		
	}
}
