package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos.ServicoDeRota;



@Component
public class ConsultarRotas {
    private ServicoDeRota servicoDeRota;

    @Autowired
    public ConsultarRotas(ServicoDeRota servicoDeRota) {
        this.servicoDeRota = servicoDeRota;
    }
    public List<Rota> run (String origem, String destino){
        return servicoDeRota.ConsultarRotas(origem,destino);
        
    }
}
