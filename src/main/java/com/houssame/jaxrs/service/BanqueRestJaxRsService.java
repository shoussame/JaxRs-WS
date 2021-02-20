package com.houssame.jaxrs.service;

import java.util.Collection;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.houssame.jaxrs.dao.CompteRepo;
import com.houssame.jaxrs.entities.Compte;

@RestController
public class BanqueRestJaxRsService {
	CompteRepo compteRepo;
	
	public BanqueRestJaxRsService(CompteRepo compteRepo) {
		super();
		this.compteRepo = compteRepo;
	}

	@GetMapping("/comptes")
	public Collection<Compte> getAll(){
		return compteRepo.findAll();
	}
	
	@GetMapping("compte/{id}")
	public Compte getById(@PathVariable long id) {
		return compteRepo.getOne(id);
	}
	
}
