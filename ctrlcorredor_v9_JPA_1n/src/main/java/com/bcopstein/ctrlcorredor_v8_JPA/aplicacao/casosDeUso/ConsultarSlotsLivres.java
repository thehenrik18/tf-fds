package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.SlotsLivresDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos.SlotsDTOServico;
@Component
public class ConsultarSlotsLivres {
    private SlotsDTOServico slotsDTOServico;
    
    @Autowired
    public ConsultarSlotsLivres(SlotsDTOServico slotsDTOServico) {
        this.slotsDTOServico = slotsDTOServico;
    }
    public SlotsLivresDTO run (int idAeroVia,Date horaPartida){
        List<Integer> retorno=slotsDTOServico.ConsultarSlotsLivres(idAeroVia, horaPartida);
        List<String> retornoString=new ArrayList<String>();
        if(retorno.isEmpty()){
            retornoString.add("Nenhum slot disponivel");
        }
        else{
            for(Integer i:retorno){
                retornoString.add(i.toString());
            }
        }
        return new SlotsLivresDTO(retornoString);

    }
}
