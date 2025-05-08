package com.SafeMove.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Agencias {
    SEDE("Sede"),
    UNIMED("Unimed"),
    UFPB("UFPB"),
    PRAIA("Praia"),
    SUL("Sul"),
    GUARABIRA("Guarabira"),
    GUARAVES("Guaraves"),
    JAGUARIBE_CT("Jaguaribe-CT"),
    PATIO("Pátio"),
    EPITACIO("Epitácio"),
    CAMPINA_GRANDE("Campina Grande"),
    PRATA("prata"),
    UNIMED_CG("Unimed CG"),
    PATOS("Patos"),
    INTERMARES("Intermares"),
    MAMANGUAPE("Mamanguape"),
    BOM_JESUS("Bom Jesus"),
    SANTA_RITA("Santa Rita"),
    SOLANEA("Solânea"),
    MONTEIRO("Monteiro"),
    CATOLE("Catolé"),
    SAPE("Sapé"),
    ITABAIANA("Itabaiana"),
    SUME("Sumé"),
    TERESINA("Teresina"),
    FLORIANO("Floriano"),
    RIO_POTY("Rio Poty"),
    PARNAIBA("Parnaíba"),
    PICOS("Picos"),
    BANANEIRAS("Bananeiras"),
    CENTRO_ADMN("Centro Adm"),
    CENTRO_JURIDICO("Centro Jurídico"),
    SAO_MAMED("São Mamede"),
    UNIFIP("Unifip"),
    JOQUEI("Jóquei"),
    TIMON("Timon");

    private final String descricao;

    private static final Map<String, Agencias> DESCRICAO_MAP = new HashMap<>();

    static {
        for (Agencias agencia : values()) {
            DESCRICAO_MAP.put(agencia.getDescricao().toLowerCase(), agencia);
        }
    }

    Agencias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public static Agencias fromDescricao(String descricao) {
        Agencias agencia = DESCRICAO_MAP.get(descricao.toLowerCase());
        if (agencia == null) {
            throw new IllegalArgumentException("Descrição inválida: " + descricao);
        }
        return agencia;
    }

    public static Optional<Agencias> tryFromDescricao(String descricao) {
        return Optional.ofNullable(DESCRICAO_MAP.get(descricao.toLowerCase()));
    }
}
