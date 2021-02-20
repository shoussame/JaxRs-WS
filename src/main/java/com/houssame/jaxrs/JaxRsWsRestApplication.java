package com.houssame.jaxrs;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.houssame.jaxrs.dao.CompteRepo;
import com.houssame.jaxrs.entities.Compte;


@SpringBootApplication
public class JaxRsWsRestApplication implements CommandLineRunner{
	@Autowired CompteRepo compteRepo;
	public static void main(String[] args) {
		SpringApplication.run(JaxRsWsRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		compteRepo.save(new Compte(15000, new Date(), "courant"));
		compteRepo.save(new Compte(20000, new Date(), "epargne"));
		compteRepo.save(new Compte(5000, new Date(), "courant"));
		compteRepo.findAll().forEach(c -> System.out.println(c.toString()));
		
	}
	
	
}
