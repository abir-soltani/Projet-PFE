package com.rnta.gpao.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.rnta.gpao.entities.Atelier;
import com.rnta.gpao.entities.Production;

public interface ProdService {

	List<Production> findAll();

	boolean saveDataFromUploadFile(MultipartFile file);

	Production saveProd(Production a);

}
