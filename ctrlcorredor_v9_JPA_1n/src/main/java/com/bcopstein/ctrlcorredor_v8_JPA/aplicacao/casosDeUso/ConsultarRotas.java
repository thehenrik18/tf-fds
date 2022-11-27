package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.RotaDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos.RotaDTOservico;



@Component
public class ConsultarRotas {
    private  RotaDTOservico rotaDTOservico;

    @Autowired
    public ConsultarRotas(RotaDTOservico rotaDTOservico) {
        this.rotaDTOservico = rotaDTOservico;
    }
    public RotaDTO run (String origem, String destino){
        return rotaDTOservico.consultarRotas(origem,destino);       
    }
}
