package com.rnta.gpao.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rnta.gpao.entities.Production;
import com.rnta.gpao.service.ProdService;
@CrossOrigin(origins = "*")
@RequestMapping("prods/api")
@Controller
public class ProdController {
	
	@Autowired
	private ProdService prodservice ;
	
	
	/*@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("prod", new Production());
		List<Production> prods = prodservice.findAll();
		model.addAttribute("prods", prods);
		return "prods" ;
	}*/
	 @ResponseBody
		@RequestMapping(method = RequestMethod.GET)
		public List<Production> getAllProduction() {
			return prodservice.findAll();
		 }
	    @ResponseBody
		@RequestMapping(value= "/import",method = RequestMethod.POST)
		public Production createProduction(@RequestBody Production p) {
			return prodservice.saveProd(p);
		}
	
	 @ResponseBody
	@RequestMapping(value= "/upload", method = RequestMethod.POST)
	public boolean uploadFile(@RequestBody Production prod  ) {
		return prodservice.saveDataFromUploadFile(prod.getFile());
		
	}
	/*@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public GammeOperatoire createAtelier(@RequestBody GammeOperatoire gamme) {
		return GammeService.saveGamme(gamme);
	}*/
	/*  @ResponseBody
	  @RequestMapping(value= "export",method = RequestMethod.POST)
     public void exportToExcel(@RequestBody HttpServletResponse response)throws IOException {
	  response.setContentType("application/octet-stream");
	  String headerKey = "Content-Disposition";
	  String headerValue="attachement; filename=productionFocke.xls";
	  response.setHeader(headerKey, headerValue);
	  List<Production> listProd = prodservice.findAll();
	  FileExporter excelexport = new FileExporter(listProd);
	  excelexport.export(response);
	  
  }*/
	
	/*  @ResponseBody
	  @RequestMapping(method = RequestMethod.GET)
	public String getAllProd(Model model) {
		List<String> prodlist = prodservice.findAll().stream().map(x->x.getNbproduct()).collect(Collectors.toList());
		List<String> datelist = prodservice.findAll().stream().map(x->x.getDate()).collect(Collectors.toList());
	    model.addAttribute("prod", prodlist);
	    model.addAttribute("date", datelist);
		return "" ;
	}
	
	  @ResponseBody
	  @RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> gePiechart(){
		List<Production> data = prodservice.findAll();
		return new ResponseEntity<>(data, HttpStatus.OK) ;
	}
*/
}
