package com.houssame.jaxrs.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private double solde;
	private Date dateCreation;
	private String type;
	public Compte(double solde, Date dateCreation, String type) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.type = type;
	}
	

}
