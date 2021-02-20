package com.houssame.jaxrs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.houssame.jaxrs.entities.Compte;

@RepositoryRestController
public interface CompteRepo extends JpaRepository<Compte, Long>{
	
}
