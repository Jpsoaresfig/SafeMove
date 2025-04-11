package com.SafeMove.SafeMove.models;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private Integer tombamento;

    private Modelo modelo;

    private String descricao; 
    
    private Colaborador pessoa;

    // Construtor padrão
    public Produto() {}

    // Getters e Setters
    public long getCodigo() {
        return codigo;
    }


    public int getTombamento() {
        return tombamento;
    }

    public void setTombamento(int tombamento) {
        this.tombamento = tombamento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
