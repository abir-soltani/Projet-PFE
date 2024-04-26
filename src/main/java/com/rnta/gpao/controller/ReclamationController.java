package com.rnta.gpao.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rnta.gpao.entities.Reclamation;
import com.rnta.gpao.service.MailService;
@CrossOrigin(origins = "*")
@RequestMapping("reclamations/api")
@Controller
public class ReclamationController {
	@Autowired
	private MailService mailservice ;
/*	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		Reclamation em = new Reclamation();
		modelMap.put("email", em);
		return "index";
	}
	//display list of reclamaton
			@GetMapping(value="/list")
			public String viewHomePage(Model model) {
			List<Reclamation> reclamation = mailservice.getAllReclamation();
				model.addAttribute("reclamation", reclamation);
		       return "listrec";
			}*/
			@ResponseBody
			@RequestMapping(method = RequestMethod.GET)
			public List<Reclamation> ggetAllReclamation() {
				return mailservice.getAllReclamation();
			 }
			
	
	@RequestMapping(value="send", method = RequestMethod.POST)
    public Reclamation Send(@RequestBody Reclamation reclamation) {
	   try {
		String content = "Nom de demandeur:" + reclamation.getNomreclameur();
		    content += "<br> Nom machine:" + reclamation.getNommachine();
	      content += "<br> Cause d arret:" + reclamation.getCausesarret();
	      content += "<br> Heure arret :" + reclamation.getHeurearret();
	      content += "<br> Motif de la demande :" + reclamation.getMessage();
	     mailservice.Send(reclamation.getToemail(),content);
	    /* Modelmap.put("msg","Done!");*/
	     
	   }catch(Exception e){
		  /* Modelmap.put("errors",e.getMessage());*/
	   }
	     return mailservice.saveReclamation(reclamation);
		
	}
	
}
