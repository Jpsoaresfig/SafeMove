package com.SafeMove.SafeMove.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.SafeMove.enums.TipoProduto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class Modelo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idModelo;

    private String marca;
    private String especificacoes;
    private boolean ativo;
    
    @Enumerated(EnumType.STRING)
    private TipoProduto tipo;

    public Modelo() {}

    // Getters e Setters
    public Long getCodigo() {
        return idModelo;
    }

    public void setCodigo(Long codigo) {
        this.idModelo = codigo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
