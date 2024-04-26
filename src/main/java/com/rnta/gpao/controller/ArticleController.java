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

import com.rnta.gpao.entities.Article;
import com.rnta.gpao.service.ArticleService;
@CrossOrigin(origins = "*")
@RequestMapping("/articles/api")
@Controller
public class ArticleController {
	@Autowired
	private ArticleService ArticleService ;
	//display list of article
	 @ResponseBody
		@RequestMapping(method = RequestMethod.GET)
		public List<Article> getAllAtelier() {
			return ArticleService.getAllArticle();
		 }
	
	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public Article getArticleById(@PathVariable("id") Long id) {	
			return ArticleService.getArticleById(id);
	    }
	
	
	 @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public Article createArticle(@RequestBody Article atelier) {
			return ArticleService.saveArticle(atelier);
		}
/*	@GetMapping("/ArticleUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") long id , Model model) {
		//get atelier from the service
		Article article = ArticleService.getArticleById(id);
		//set atelier as a model attribute to pre-populate the form
		model.addAttribute("article", article);
		return "update_article";
		
		
	}
	*/
	 @RequestMapping(method = RequestMethod.PUT)
		public Article updateArticle(@RequestBody Article article) {
			return ArticleService.updateArticle(article);
		}
/*	@GetMapping("/deleteArticle/{id}")
	public String deleteArticle(@PathVariable (value = "id") long id) {
		//call delete atelier method 
		this.ArticleService.deleteArticleById(id);
		return "redirect:/larticle";
	}*/
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteArticle(@PathVariable("id") Long id)
	{
		ArticleService.deleteArticleById(id);
	}

}
