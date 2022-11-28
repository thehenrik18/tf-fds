package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos;

import java.util.List;


public class SlotsLivresDTO {
    List<String> slotsLivres;

    public SlotsLivresDTO(List<String> slotsLivres) {
        this.slotsLivres = slotsLivres;
    }

    public List<String> getSlotsLivres() {
        return slotsLivres;
    }

}
