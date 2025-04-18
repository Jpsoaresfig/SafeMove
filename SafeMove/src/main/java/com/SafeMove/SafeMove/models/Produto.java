package com.SafeMove.SafeMove.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private Integer tombamento;  // Usar Integer se puder ser nulo
    
    @ManyToOne
    private Modelo modelo;

    private String descricao; 

    @ManyToOne
    private Colaborador pessoa;

    // Construtores, Getters e Setters
    public Produto() {}

    public Long getCodigo() {
        return codigo;  // Alterado para Long para consistência com o tipo do campo
    }

    public Integer getTombamento() {  // Alterado para Integer para consistência com o tipo do campo
        return tombamento;
    }

    public void setTombamento(Integer tombamento) {
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

    public Colaborador getPessoa() {
        return pessoa;
    }

    public void setPessoa(Colaborador pessoa) {
        this.pessoa = pessoa;
    }
}
