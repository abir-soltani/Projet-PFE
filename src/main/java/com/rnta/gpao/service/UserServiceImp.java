package com.rnta.gpao.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rnta.gpao.entities.User;
import com.rnta.gpao.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	@Autowired 
	UserRepository userRepository ;

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
		
	}
	@Override
	public User getUserById(long id) {
		Optional<User> optional = userRepository.findById(id);
		User user = null;
		if(optional.isPresent()) {
			user =  optional.get();
		}else {
			throw new RuntimeException("User n'est pas trouvée par l'id ::"+ id);
		}
		return user ;
	}
	@Override
	public void deleteUserById(long id) {
		this.userRepository.deleteById(id);
		
	}
	private Optional<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	@Override
	public boolean checkLogin(String username, String password) {
		
		Optional<User> optionalUser = findByUsername(username);
		if(optionalUser.isPresent()&& optionalUser.get().getPassword().equals(password) ) {
			return true ;
		}
		return false;
	}
	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}
	
	
	
	
	

}
