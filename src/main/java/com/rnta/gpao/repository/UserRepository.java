package com.rnta.gpao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rnta.gpao.entities.User;

public interface UserRepository extends CrudRepository<User, Long > {

	List<User> findAll();

	Optional<User> findByUsername(String username);

	
	
}
