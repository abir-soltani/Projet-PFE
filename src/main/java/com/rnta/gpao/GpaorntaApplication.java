package com.rnta.gpao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rnta.gpao.entities.User;

@SpringBootApplication
public class GpaorntaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpaorntaApplication.class, args);
	}
	
	@Bean(name = "USER_BEAN")
	public User setUser() {
		
		User u = new User();
		u.setUsername("admin");
		u.setPassword("admin123");
		return u ;
		
	}
	
	

}
