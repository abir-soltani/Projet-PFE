package com.rnta.gpao.service;

import java.util.List;
import com.rnta.gpao.entities.User;


public interface UserService {

	List<User> getAllUser();
	User getUserById(long id);
	void deleteUserById(long id);
	User saveUser(User user);
	
	boolean checkLogin(String username , String password);
	User updateUser(User user);


}
