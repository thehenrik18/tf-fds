package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import java.util.Date;
import java.util.List;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos.ServicoAeroVia;

public class ConsultarSlotsLivres {
    private ServicoAeroVia servicoAeroVia;

    public ConsultarSlotsLivres(ServicoAeroVia servicoDeRota) {
        this.servicoAeroVia = servicoDeRota;
    }
    public List<Integer> run (String idAeroVia,Date horaPartida){
        return servicoAeroVia.ConsultarSlotsLivres( idAeroVia, horaPartida);
        
    }
}
