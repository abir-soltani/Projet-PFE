package com.rnta.gpao.service;

import java.util.List;

import java.util.Optional;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.rnta.gpao.config.MyConstant;
import com.rnta.gpao.entities.RapportIntervention;
import com.rnta.gpao.repository.RapportinterRepository;

@Service
public class RapportinterServiceImpl implements RapportinterService {
	
	@Autowired
	private RapportinterRepository rapprepo ;
	
	@Autowired 
	private JavaMailSender javaMailsender ;

	
	@Override
	public void Send(String toemail, String content) throws Exception {
		MimeMessage mimemessage = javaMailsender.createMimeMessage();
	    MimeMessageHelper mimemessagehelper = new MimeMessageHelper(mimemessage,true,"UTF-8");
	    mimemessagehelper.setTo(toemail);
	    mimemessagehelper.setFrom(MyConstant.MY_EMAIL);
	    mimemessagehelper.setSubject("Demande de rapport d'intervention");
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
	public List<RapportIntervention> getAllInter() {
		
		return rapprepo.findAll();
	}

	@Override
	public RapportIntervention saveInter(RapportIntervention inter) {
		return rapprepo.save(inter);
		
	}

	@Override
	public RapportIntervention getInterById(Long id) {
		Optional<RapportIntervention> optional = rapprepo.findById(id);
		RapportIntervention inter = null;
		if(optional.isPresent()) {
			inter =  optional.get();
		}else {
			throw new RuntimeException("effectif n'est pas trouvée par l'id ::"+ id);
		}
		return inter;
	}


}
