package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IPlanoVooRepository;

@Component
public class ServicoPlanoVoo {
    private IPlanoVooRepository planoVooRepository;

    @Autowired
    public ServicoPlanoVoo(IPlanoVooRepository planoVooRepository) {
        this.planoVooRepository = planoVooRepository;
    }

    public String verificaPlanoDeVoo(Date data,Date hPartida,
    int idVoo,String nomeRota,int velocidade,int sentidoAeroVia
    ){
        return planoVooRepository.verificaPlanoDeVoo(data,hPartida,idVoo,
        nomeRota,velocidade,sentidoAeroVia);
    }
   public  String liberaPlanoVoo(int idVoo){
        return planoVooRepository.liberaPlanoVoo(idVoo);
    }
    public String cancelaPlanoVoo(int idVoo){
        return planoVooRepository.cancelaPlanoVoo(idVoo);
    }
   }

