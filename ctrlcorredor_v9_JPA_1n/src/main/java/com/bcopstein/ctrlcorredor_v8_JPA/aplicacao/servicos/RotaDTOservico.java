package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.RotaDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IRotaRepository;


@Component
public class RotaDTOservico {
private IRotaRepository rotaRepository;    

@Autowired
public RotaDTOservico(IRotaRepository rotaRepository) {
    this.rotaRepository = rotaRepository;
}

public RotaDTO consultarRotas(String origem, String destino){
    
    //pega do servico da camada de negocio todas as rotas que possuem origem e destino indicados
    List<Rota> rotas=rotaRepository.todas().stream()
    .filter(r->r.getOrigem().equals(origem))
    .filter(r->r.getDestino().equals(destino))
    .toList();;

    //cria uma lista que pega o nome dessas rotas
    List<String> nomesRotas=new ArrayList<String>();
    for(Rota rota:rotas){
        nomesRotas.add(((Integer)rota.getIdRota()).toString());
    }

    //se a lista for vazia adiciona apenas mensagem de erro
    if(nomesRotas.isEmpty()){
      nomesRotas.add("Não há rotas para estes valores de origem e destino");
    }
    //retorna o DTO com a lista de nomes de rotas
    return new RotaDTO(nomesRotas);

  }

}
