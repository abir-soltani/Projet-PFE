package com.rnta.gpao.service;

import java.util.List;

import com.rnta.gpao.entities.Reclamation;

public interface MailService {
	
public void Send(String toemail, String content) throws Exception;

List<Reclamation> getAllReclamation();


Reclamation saveReclamation(Reclamation a);


}
