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

import com.rnta.gpao.entities.Atelier;
import com.rnta.gpao.service.AtelierService;
@CrossOrigin(origins = "*")
@RequestMapping("/ateliers/api")
@Controller
public class AtelierController {

	@Autowired
	private AtelierService atelierService ;
	//display list of ateliers
    @ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<Atelier> getAllAtelier() {
		return atelierService.getAllAteliers();
	 }
    @ResponseBody
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Atelier getAtelierById(@PathVariable("id") Long id) {	
		return atelierService.getAtelier(id);
    }
    @ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Atelier createAtelier(@RequestBody Atelier atelier) {
		return atelierService.saveAtelier(atelier);
	}
    @ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public Atelier updateAtelier(@RequestBody Atelier atelier) {
		return atelierService.updateAtelier(atelier);
	}
	/*@RequestMapping(value="/{id}",method = RequestMethod.PUT,produces = "application/json")
	public void updateAtelier(@PathVariable("id") Long id,@RequestBody Atelier atelier)
	{
		atelierService.getAtelierById(id);
		 System.out.println("Updating " + id);
	}*/
	 @ResponseBody
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAtelier(@PathVariable("id") Long id)
	{
		atelierService.deleteAtelierById(id);
	}
}
