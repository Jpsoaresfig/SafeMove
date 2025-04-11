package com.SafeMove.SafeMove.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Setor  implements Serializable{
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long codigo;
	 
	 private String nome;
	 
}
