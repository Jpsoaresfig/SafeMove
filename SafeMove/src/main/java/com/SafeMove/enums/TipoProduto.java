	package com.SafeMove.enums;
	
	public enum TipoProduto {
		MONITOR("Monitor"),
	    COMPUTADOR("Computador"),
	    IMPRESSORA("Impressora"),
	    LEITOR_DE_CHEQUE("Leitor de Cheque"),
	    WEBCAM("Webcam"),
	    FONE_DE_OUVIDO("Fone de Ouvido"),
	    TECLADO_SEM_FIO("Teclado Sem Fio"),
	    PROJETOR("Projetor"),
	    NOBREAK("Nobreak");
	    private final String descricao;
	
	    TipoProduto(String descricao) {
	        this.descricao = descricao;
	    }
	
	    public String getDescricao() {
	        return descricao;
	    }
	}