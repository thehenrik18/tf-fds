package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos;

import java.util.List;

public class RotaDTO {
    List<String> nomesRotas;

    public RotaDTO(List<String> nomesRotas) {
        this.nomesRotas = nomesRotas;
    }
    public List<String> getNomesRotas() {
        return nomesRotas;
    }
}
