package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.SlotsLivresDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IAeroviaRepository;

@Component
public class SlotsDTOServico {
    private IAeroviaRepository aeroviaRepository;

    @Autowired
    public SlotsDTOServico(IAeroviaRepository aeroviaRepository) {
        this.aeroviaRepository = aeroviaRepository;
    }

    public SlotsLivresDTO ConsultarSlotsLivres(String idAeroVia, Date horaPartida) {
    List<Integer> slots= aeroviaRepository.ConsultarSlotsLivres(idAeroVia, horaPartida);
    List<String> retorno= new ArrayList<String>();

    for (Integer slot : slots) {
        retorno.add(slot.toString());
    }
    if(retorno.isEmpty()){
        retorno.add("Nenhum slot livre");
    }
    return new SlotsLivresDTO(retorno);
    
    }
}
