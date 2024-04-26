package com.rnta.gpao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnta.gpao.entities.Permission;
import com.rnta.gpao.repository.PermissionRepository;

@Service
public class PermissionServiceImp implements PermissionService  {

	
	@Autowired
	private PermissionRepository permissionRepository;
	
	@Override
	public List<Permission> getAllPermission() {
		
		return permissionRepository.findAll();
	}

	@Override
	public Permission savePermission(Permission permission) {
		return permissionRepository.save(permission);
		
	}

	@Override
	public Permission getPermissionById(Long id) {
		Optional<Permission> optional = permissionRepository.findById(id);
		Permission permission = null;
		if(optional.isPresent()) {
			permission =  optional.get();
		}else {
			throw new RuntimeException("Atelier n'est pas trouvée par l'id ::"+ id);
		}
		return permission;
	}
	
	

	

}
