package com.rnta.gpao.service;


import java.util.List;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.rnta.gpao.config.MyConstant;
import com.rnta.gpao.entities.Reclamation;

import com.rnta.gpao.repository.ReclamationRepositoy;
@Service
public class MailServiceImpl implements MailService {
   
	@Autowired 
	private JavaMailSender javaMailsender ;
	@Autowired
	private ReclamationRepositoy recRepository;

	
	@Override
	public void Send(String toemail, String content) throws Exception {
		MimeMessage mimemessage = javaMailsender.createMimeMessage();
	    MimeMessageHelper mimemessagehelper = new MimeMessageHelper(mimemessage,true,"UTF-8");
	    mimemessagehelper.setTo(toemail);
	    mimemessagehelper.setFrom(MyConstant.MY_EMAIL);
	    mimemessagehelper.setSubject("Demande d'intervention");
	 /* mimemessagehelper.setText(content, true);*/
	  mimemessagehelper.setText(content, true);
	  /* mimemessagehelper.setText(nomatelier, true);
	    mimemessagehelper.setText(causesarret, true);*/
	  //  mimemessagehelper.setSentDate(heurearret);
	///mimemessagehelper.setText(message, true);
	//    mimemessagehelper.setSentDate(new Date());
	    
	    javaMailsender.send(mimemessage);
	    System.out.println("Email sent");
	}

	@Override
	public List<Reclamation> getAllReclamation() {
		return recRepository.findAll();
	}
	

	@Override
	public Reclamation saveReclamation(Reclamation a) {
		return recRepository.save(a);
	}

}
