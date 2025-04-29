package com.SafeMove.SafeMove.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColaborador;

    private String nome;
    private Long ramal;

    @Column(unique = true) // garante que o lDap seja único
    private String lDap;

    @ManyToOne
    private Destinos destino; 

    // Construtores, Getters e Setters

    public Colaborador() {}

    public Long getCodigo() {
        return idColaborador;
    }

    public void setCodigo(Long codigo) {
        this.idColaborador = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRamal() {
        return ramal;
    }

    public void setRamal(Long ramal) {
        this.ramal = ramal;
    }

    public String getLDap() {
        return lDap;
    }

    public void setLDap(String lDap) {
        this.lDap = lDap;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destinos) {
        this.destino = destinos;
    }
}