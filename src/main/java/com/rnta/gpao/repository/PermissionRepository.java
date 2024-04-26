package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rnta.gpao.entities.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {


	List<Permission> findAll();
}
