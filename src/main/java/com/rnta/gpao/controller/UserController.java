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

import com.rnta.gpao.entities.User;
import com.rnta.gpao.service.UserService;
@CrossOrigin(origins = "*")
@RequestMapping("utilisateurs/api")
@Controller
public class UserController {

	@Autowired
	private UserService userService ;
	@Autowired 
	 User _userBean;
	//display list of Users
	/*@GetMapping("/listeu")
	public String viewHomePage(Model model, HttpSession session) {
		if(session.getAttribute("Username") !=null) {
		model.addAttribute("listeUsers",userService.getAllUser());
		return "listeuser";}
		return "login";
	}*/
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userService.getAllUser();
	 }
	
	/*@GetMapping("/showNewUserForm")
	  //create model attribute to bind form data
	public String showNewUserForm(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "new_user";
	}*/
	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public User getUserById(@PathVariable("id") Long id) {	
			return userService.getUserById(id);
	    }
	
	/*@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		//save atelier to databse
		userService.saveUser(user);
		return "redirect:/listeu";
		
	}*/
	 @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public User createUser(@RequestBody User user) {
			return userService.saveUser(user);
		}
	/*@GetMapping("/showFormForUpdateUser/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id , Model model) {
		//get User from the service
		User user = userService.getUserById(id);
		//set User as a model attribute to pre-populate the form
		model.addAttribute("user", user);
		return "update_user";
	 
		
		
	}*/
	 @RequestMapping(method = RequestMethod.PUT)
		public User updateUser(@RequestBody User user) {
			return userService.updateUser(user);
		}
	
	/*@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable (value = "id") long id) {
		//call delete User method 
		this.userService.deleteUserById(id);
		return "redirect:/listeu";
	}*/
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteUser(@PathVariable("id") Long id)
		{
		 userService.deleteUserById(id);
		}
	
	//=============================================
	
	/*@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	@PostMapping("/checkLogin")
	public String checkLogin(Model model ,@RequestParam("username")String username , @RequestParam("password")String password,
			HttpSession session) {
		
		//if(_userBean.getUsername().equals(username)&& _userBean.getPassword().equals(password) )
		
	//	{ System.out.println("Login aaaa");
		   if(userService.checkLogin(username,password)) {
			   System.out.println("Login yes");
			   session.setAttribute("Username", username);
			   model.addAttribute("user", userService.getAllUser());
			   return "listeuser";
		   }else {
			   System.out.println("Login byyy");
			   model.addAttribute("ERROR","email ou Mot passe n existe pas");
		   }
		     
			
		//}else {
		//	System.out.println("Login byy");
			
		//}
		return "login";

	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("Username");
		return "redirect:/login";
	}*/
}



