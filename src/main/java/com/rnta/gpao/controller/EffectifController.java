package com.rnta.gpao.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rnta.gpao.entities.PresenceEffectif;
import com.rnta.gpao.service.EffectifService;
@CrossOrigin(origins = "*")
@RequestMapping("/presences/api")
@Controller
public class EffectifController {
	
	
	@Autowired
	private EffectifService effectifService ;
	//display list of effectif
/*	@GetMapping("/listePresenceEffectifs")
	public String viewHomePage(Model model) {
		model.addAttribute("listePresenceEffectifs",effectifService.getAllPresenceEffectif());
       return "listep";
	}*/
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<PresenceEffectif> getAllPresenceEffectif() {
		return  effectifService.getAllPresenceEffectif();
	 }
	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public PresenceEffectif geteffectifServiceById(@PathVariable("id") Long id) {	
			return effectifService.getPresenceEffectifById(id);
	    }
	 @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public PresenceEffectif createPresenceEffectif(@RequestBody PresenceEffectif effectif) {
			return effectifService.savePresenceEffectif(effectif);
		}
	 @RequestMapping(method = RequestMethod.PUT)
		public PresenceEffectif updatePresenceEffectif(@RequestBody PresenceEffectif effectif) {
			return effectifService.updatePresenceEffectif(effectif);
		}
	

	 

}
