package com.rnta.gpao.service;

import java.util.List;


import com.rnta.gpao.entities.GammeOperatoire;



public interface GammeService {
	List<GammeOperatoire> getAllGamme();
	GammeOperatoire saveGamme(GammeOperatoire gamme);
	GammeOperatoire getGammeById(Long id);
	void deleteGammeById(Long id);
	GammeOperatoire updateGamme(GammeOperatoire gamme);


}
