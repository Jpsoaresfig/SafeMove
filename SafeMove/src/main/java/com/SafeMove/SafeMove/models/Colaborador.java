package com.SafeMove.SafeMove.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Colaborador implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    
    private String nome;
    
    private Long ramal;
    
    @Column(unique = true)//se existir outro igual vai quebrar 
    private String lDap;
        
    private Setor setor;
	
}
