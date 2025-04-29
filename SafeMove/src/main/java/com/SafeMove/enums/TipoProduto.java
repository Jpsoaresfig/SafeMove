package com.SafeMove.enums;

public enum TipoProduto {
    MONITOR("Monitor"),
    COMPUTADOR("Computador"),
    IMPRESSORA("Impressora"),
    LEITOR_DE_CHEQUE("Leitor de Cheque");

    private final String descricao;

    TipoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}