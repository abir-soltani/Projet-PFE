package com.rnta.gpao.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rnta.gpao.entities.Machine;
import com.rnta.gpao.service.MachineService;
@CrossOrigin(origins = "*")
@RequestMapping("/machines/api")
@Controller
public class MachineController {
	@Autowired
	private MachineService machineService ;
	//display list of ateliers
	/*@GetMapping("/listemachine")
	public String viewHomePage(Model model) {
		model.addAttribute("listeMachines",machineService.getAllMachine());
       return "listem";
	
	
	
	
	@PostMapping("/saveMachine")
	public String saveMachine(@ModelAttribute("machine") Machine machine ) {
		//save Machine to databse
		machineService.saveMachine(machine);
		return "redirect:/listemachine";
		
	}
	@GetMapping("/showFormForUpdateMachine/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id , Model model) {
		//get Machine from the service
		Machine machine = machineService.getMachineById(id);
		//set Machine as a model attribute to pre-populate the form
		model.addAttribute("machine", machine);
		return "update_machine";
		
		
	}
	
	@GetMapping("/deleteMachine/{id}")
	public String deleteMachine(@PathVariable (value = "id") long id) {
		//call delete Machine method 
		this.machineService.deleteMachineById(id);
		return "redirect:/listemachine";
	}*/
	  @ResponseBody
		@RequestMapping(method = RequestMethod.GET)
		public List<Machine> getAllMachine() {
			return machineService.getAllMachine();
		 }
	  @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public Machine getMachineById(@PathVariable("id") Long id) {	
			return machineService.getMachineById(id);
	    }
	  @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public Machine createMachine(@RequestBody Machine machine) {  
			return machineService.saveMachine(machine);
		}
	 /* @GetMapping("/showNewMachineForm")
	  //create model attribute to bind form data
	public String showNewMachineForm(Model model){
		Machine machine = new Machine();
		model.addAttribute("machine",machine);
		List<String> machineList = Arrays.asList("Confection","Paquetage");
		
		model.addAttribute("machineList", machineList);
		return "new_machine";
	}*/
	  @ResponseBody
	  @RequestMapping(method = RequestMethod.PUT)
		public Machine updateMachine(@RequestBody Machine machine) {
			return machineService.updateMachine(machine);
		}
	 
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteMachine(@PathVariable("id") Long id)
		{
		  machineService.deleteMachineById(id);
		}
}
