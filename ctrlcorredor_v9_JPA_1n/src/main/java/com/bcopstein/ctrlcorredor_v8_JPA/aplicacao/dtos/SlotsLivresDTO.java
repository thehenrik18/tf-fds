package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SlotsLivresDTO {
    List<String> slotsLivres;

    @Autowired
    public SlotsLivresDTO(List<String> slotsLivres) {
        this.slotsLivres = slotsLivres;
    }

    public List<String> getSlotsLivres() {
        return slotsLivres;
    }

}
