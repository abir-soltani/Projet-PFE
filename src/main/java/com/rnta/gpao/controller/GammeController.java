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

import com.rnta.gpao.entities.GammeOperatoire;
import com.rnta.gpao.service.GammeService;
@CrossOrigin(origins = "*")
@RequestMapping("/gammes/api")
@Controller
public class GammeController {

	@Autowired
	private GammeService GammeService ;
	/*//display list of gammes operatoires
	@GetMapping("listegamme")
	public String viewHomePage(Model model) {
		model.addAttribute("listegamme",GammeService.getAllGamme());
       return "lgamme";
	}
	@GetMapping("/newgamme")
	  //create model attribute to bind form data
	public String showNewAtelierForm(Model model){
		GammeOperatoire gamme = new GammeOperatoire();
		model.addAttribute("gamme",gamme);
		return "new_gamme";
	}
	
	@PostMapping("/savegamme")
	public String saveGamme(@ModelAttribute("gamme") GammeOperatoire gamme ) {
		//save atelier to databse
		GammeService.saveGamme(gamme);
		return "redirect:/listegamme";
		
	}
	@GetMapping("/gammeUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") long id , Model model) {
		//get atelier from the service
		GammeOperatoire gamme = GammeService.getGammeById(id);
		//set atelier as a model attribute to pre-populate the form
		model.addAttribute("gamme", gamme);
		return "update_gamme";
		
		
	}
	
	@GetMapping("/deletegamme/{id}")
	public String deleteGamme(@PathVariable (value = "id") long id) {
		//call delete atelier method 
		this.GammeService.deleteGammeById(id);
		return "redirect:/lgamme";
	}*/
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<GammeOperatoire> getAllGamme() {
		return GammeService.getAllGamme();
	 }
	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public GammeOperatoire getGammeOperatoireById(@PathVariable("id") Long id) {	
			return GammeService.getGammeById(id);
	    }
	 @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public GammeOperatoire createAtelier(@RequestBody GammeOperatoire gamme) {
			return GammeService.saveGamme(gamme);
		}
	 @RequestMapping(method = RequestMethod.PUT)
		public GammeOperatoire updateGamme(@RequestBody GammeOperatoire gamme) {
			return GammeService.updateGamme(gamme);
		}
	 @ResponseBody
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteGammeOperatoire(@PathVariable("id") Long id)
		{
		       GammeService.deleteGammeById(id);
		}
}
