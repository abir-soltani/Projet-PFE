package com.rnta.gpao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rnta.gpao.entities.Production;
import com.rnta.gpao.entities.Statistique;
import com.rnta.gpao.service.StatService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("stat/api")
public class StatController {
	
@Autowired private StatService statservice;

@GetMapping("/stat")
public List<Statistique> list(){
	System.out.println("tous les stat");
	return statservice.getAll();
}

}
