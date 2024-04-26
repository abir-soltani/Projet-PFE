package com.rnta.gpao.service;

import java.util.List;

import com.rnta.gpao.entities.Permission;

public interface PermissionService {
	
	
	List<Permission> getAllPermission();
	Permission savePermission(Permission permission);
	Permission getPermissionById(Long id);

}
