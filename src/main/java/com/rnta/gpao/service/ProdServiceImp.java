package com.rnta.gpao.service;


import java.io.IOException;


import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rnta.gpao.entities.Atelier;
import com.rnta.gpao.entities.Production;
import com.rnta.gpao.repository.ProdRepository;

@Service
@Transactional
public class ProdServiceImp implements ProdService{
	
	@Autowired 
	private ProdRepository prodrepository ;

	@Override
	public List<Production> findAll() {

		return (List<Production>) prodrepository.findAll();
	}
	@Override
	public Production saveProd(Production a) {
		return prodrepository.save(a);
	}
	@Override
	public boolean saveDataFromUploadFile(MultipartFile file) {
		
		boolean isFlag = false ;
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		if(extension.equalsIgnoreCase("json")) {
			isFlag= readDataFromJson(file);
		}else if (extension.equalsIgnoreCase("xls") || extension.equalsIgnoreCase("xlsx")) {
			try {
				isFlag = readDataFromExcel(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		return isFlag;
	}

	private boolean readDataFromExcel(MultipartFile file) throws IOException {
		// Get the workbook object for XLS file
		HSSFWorkbook   workbook = new HSSFWorkbook (file.getInputStream());
		// Get first sheet from the workbook
				HSSFSheet   sheet = workbook.getSheetAt(0);
				/*Iterator<Row> rows = sheet.iterator();
				rows.next();
				/*while(rows.hasNext()) {
					XSSFRow  row = rows.next();
					*/
					//if(i==7)
						/*System.out.println("Date: "+sheet.getRow(7).getCell(1));
						System.out.println("Dateee: "+sheet.getRow(13).getCell(0));
						System.out.println("Dateee: "+sheet.getRow(22).getCell(4));
						System.out.println("Dateee: "+sheet.getRow(47).getCell(2));*/

						/*System.out.println("totale production: "+sheet.getRow(29).getCell(5).getNumericCellValue());*/
				
			
					Production prod = new Production();
                         Cell  cell= sheet.getRow(7).getCell(1);
					 if(HSSFDateUtil.isCellDateFormatted(cell)){// Process date format, time format
							SimpleDateFormat sdf = null;
							if (sheet.getRow(7).getCell(1).getCellStyle().getDataFormat() == HSSFDataFormat.getBuiltinFormat("h:mm")) {
								sdf = new SimpleDateFormat("HH:mm");
							 } else {// date
								sdf = new SimpleDateFormat("yyyy-MM-dd");
							}
							Date date = sheet.getRow(7).getCell(1).getDateCellValue();

							prod.setDatep(sdf.format(date));
							}

					
				            
					/*if(sheet.getRow(7).getCell(1).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						prod.setDate(sheet.getRow(7).getCell(1).getDateCellValue());
						
					}*/
					 
					 
					
					if(sheet.getRow(29).getCell(0).getCellType() == Cell.CELL_TYPE_STRING) {
						prod.setNommach((sheet.getRow(29).getCell(0).getStringCellValue()));
					}
					
					if(sheet.getRow(29).getCell(2).getCellType() == Cell.CELL_TYPE_NUMERIC){
						prod.setDureepost(sheet.getRow(29).getCell(2).getDateCellValue());
						
					}
					if(sheet.getRow(29).getCell(3).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
						Date date =sheet.getRow(29).getCell(3).getDateCellValue();
						prod.setDureeservice(date);
					}
					
					if(sheet.getRow(29).getCell(5).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						String totalprod = NumberToTextConverter.toText(sheet.getRow(29).getCell(5).getNumericCellValue());
						prod.setNbpoduction(totalprod);
					}
					if(sheet.getRow(29).getCell(6).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						String nbdechet = NumberToTextConverter.toText(sheet.getRow(29).getCell(6).getNumericCellValue());
						prod.setNbdechets(nbdechet);
						
					}
					
					 /*int rowLength = sheet.getLastRowNum();//Total number of rows
					 Row row = sheet.getRow(40);
					 int colLength = row.getLastCellNum();//Total number of columns
					 Cell c = row.getCell(0);//The first cell of the first row
					 for (int i =40; i <= rowLength; i++) {       
			                row = sheet.getRow(i);
			                for (int j = 0; j < colLength; j++) {
			                                         //Column: 0 name 1 staff number 2 
			                    c = row.getCell(j);
			                    if (c != null) {
			                        c.setCellType(Cell.CELL_TYPE_STRING);//Set the cell type to string
			                        String data = c.getStringCellValue();
			                        prod.setArrets(data);
			              }
			                    if (c != null) {
			                        c.setCellValue(Cell.CELL_TYPE_STRING);//Set the cell type to string
			                        Date data = c.getDateCellValue();
			                          prod.setDureearret(data);
			                            
			                }
			                }
					 }*/
                  /*    
					if(sheet.getRow(104).getCell(0).getCellType() == Cell.CELL_TYPE_STRING) {
						prod.setArrets((sheet.getRow(104).getCell(0).getStringCellValue()));
					}*/
					/*if(sheet.getRow(104).getCell(2).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
						Date date =sheet.getRow(104).getCell(2).getDateCellValue();
						prod.setDureearret(date);
					}*/
					/*if(sheet.getRow(122).getCell(0).getCellType() == Cell.CELL_TYPE_STRING) {
						prod.setAnalyseArret((sheet.getRow(122).getCell(0).getStringCellValue()));
					}
					if(sheet.getRow(122).getCell(2).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
						Date date =sheet.getRow(122).getCell(2).getDateCellValue();
						prod.setDureArrets(date);*/
					
					prod.setFileType(FilenameUtils.getExtension(file.getOriginalFilename()));
					prodrepository.save(prod);
					
				
		return false;
	}

	@SuppressWarnings("unused")
	private Workbook getWorkBook(MultipartFile file) {
		Workbook workbook = null ;
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		 try {
			 if(extension.equalsIgnoreCase("xlsx")) {
				 workbook = new XSSFWorkbook(file.getInputStream());
			 }else if(extension.equalsIgnoreCase("xls")) {
				 
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 
		 }
		return workbook;
	}



	private boolean readDataFromJson(MultipartFile file) {
		try {
			InputStream inputStream = file.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			List<Production> prods = Arrays.asList(mapper.readValue(inputStream, Production[].class ));
			if(prods!=null&& prods.size()<0) {
				for(Production prod : prods) {
					prod.setFileType(FilenameUtils.getExtension(file.getOriginalFilename()));
					prodrepository.save(prod);
				}
				return true;
			}
			
		}catch(Exception e) {
			return false;
			
		}
		
		return false;
	}
	

}
