package com.SafeMove.SafeMove.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.SafeMove.enums.Agencias;

@Entity
public class Destinos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDestino;

    private String setor; // caso precise especificar o setor
    
    @Enumerated(EnumType.STRING) // Armazena o nome da constante do enum no banco
    private Agencias agencia;


    public Destinos() {
       
    }

    public Destinos(long codigo, String agencia, String setor) {
        this.idDestino = codigo;
        
        this.setor = setor;
    }

    public long getCodigo() {
        return idDestino;
    }

    public void setCodigo(long codigo) {
        this.idDestino = codigo;
    }

    public Agencias getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencias agencia) {
        this.agencia = agencia;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}