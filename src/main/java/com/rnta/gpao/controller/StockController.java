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

import com.rnta.gpao.entities.Stock ;
import com.rnta.gpao.service.StockService;

@CrossOrigin(origins = "*")
@RequestMapping("stocks/api")
@Controller
public class StockController {


	@Autowired
	private StockService stockService ;
	//display list of effectif

	 @ResponseBody
		@RequestMapping(method = RequestMethod.GET)
		public List<Stock> getAllAtelier() {
			return stockService.getAllStock();
		 }

	 @ResponseBody
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public Stock getStockById(@PathVariable("id") Long id) {	
			return stockService.getStockById(id);
	    }

	 @ResponseBody
		@RequestMapping(method = RequestMethod.POST)
		public Stock createStock(@RequestBody Stock stock) {
			return stockService.saveStock(stock);
		}

	/* @RequestMapping(value="/{id}",method = RequestMethod.PUT,produces = "application/json")
		public void updateStock(@PathVariable("id") Long id)
		{
		   stockService.getStockById(id);
			 System.out.println("Updating " + id);
		}*/
	 @RequestMapping(method = RequestMethod.PUT)
		public Stock updateStock(@RequestBody Stock stock) {
			return stockService.updateStock(stock);
		}

}
