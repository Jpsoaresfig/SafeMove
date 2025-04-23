package com.SafeMove.SafeMove.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Integer tombamento;
    private String descricao;
    private String modelo;
    private String pessoa;

    @ManyToOne
    private Destinos destino; 

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Integer getTombamento() {
        return tombamento;
    }

    public void setTombamento(Integer tombamento) {
        this.tombamento = tombamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tombamento=" + tombamento +
                ", descricao='" + descricao + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pessoa='" + pessoa + '\'' +
                ", destino=" + destino + // Alterado para exibir o objeto Destino
                '}';
    }
}