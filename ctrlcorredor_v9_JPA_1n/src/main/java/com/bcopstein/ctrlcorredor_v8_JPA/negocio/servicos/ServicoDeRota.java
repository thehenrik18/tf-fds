package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IRotaRepository;



@Component
public class ServicoDeRota {
    private IRotaRepository rotaRep;

    @Autowired
    public ServicoDeRota(IRotaRepository rotaRep) {
        this.rotaRep = rotaRep;
     
    }
   
    public List<Rota> ConsultarRotas(String origem, String destino) {
        return rotaRep.todas().stream()
            .filter(r->r.getOrigem().equals(origem))
            .filter(r->r.getDestino().equals(destino))
            .toList();
    }
}
