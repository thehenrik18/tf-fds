package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import java.util.Date;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.SlotsLivresDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos.SlotsDTOServico;
public class ConsultarSlotsLivres {
    private SlotsDTOServico slotsDTOServico;

    public ConsultarSlotsLivres(SlotsDTOServico slotsDTOServico) {
        this.slotsDTOServico = slotsDTOServico;
    }
    public SlotsLivresDTO run (String idAeroVia,Date horaPartida){
        return slotsDTOServico.ConsultarSlotsLivres( idAeroVia, horaPartida);
        
    }
}
