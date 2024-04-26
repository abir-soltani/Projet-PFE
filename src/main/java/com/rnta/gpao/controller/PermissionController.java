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

import com.rnta.gpao.entities.Permission;
import com.rnta.gpao.service.PermissionService;


@CrossOrigin(origins = "*")
@RequestMapping("permissions/api")
@Controller
public class PermissionController {
	
	@Autowired
	private PermissionService permissionService ;
	//display list of ateliers
	/*@GetMapping("/listPermissions")
	public String viewHomePage(Model model) {
		model.addAttribute("listePermissions",permissionService.getAllPermission());
       return "listepermis";
	}
	*/
	 @ResponseBody
		@RequestMapping(method = RequestMethod.GET)
		public List<Permission> getAllPermission() {
			return permissionService.getAllPermission();
		 }
	/*@GetMapping("/showNewPermissionForm")
	  //create model attribute to bind form data
	public String showNewPermissionForm(Model model){
		Permission permission = new Permission();
		model.addAttribute("permission",permission);
		return "new_permission";
	}
	*/
	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public Permission getPermissionById(@PathVariable("id") Long id) {	
			return permissionService.getPermissionById(id);
	    }
	/*@PostMapping("/savePermission")
	public String savePermission(@ModelAttribute("permission") Permission permission) {
		//save  to databse
		permissionService.savePermission(permission);
		return "redirect:listPermissions";
		
	}*/
	  @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public Permission createPermission(@RequestBody Permission permission) {
			return permissionService.savePermission(permission);
		}
}
