package com.SafeMove.SafeMove.models;

import com.SafeMove.enums.TipoProduto;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProdtuo;

    private String nome;
    private String descricao;
    private Integer tombamento;
    private Colaborador colaborador;

    public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Integer getTombamento() {
		return tombamento;
	}

	public void setTombamento(Integer tombamento) {
		this.tombamento = tombamento;
	}

	@ManyToOne
    private Modelo modelo;

    @ManyToOne
    private Destinos destino;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipo; 

    public Produto() {}

    // Getters e Setters
    public Long getCodigo() {
        return idProdtuo;
    }

    public void setCodigo(Long codigo) {
        this.idProdtuo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }
}