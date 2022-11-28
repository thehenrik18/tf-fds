package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.LiberarPlanoDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IPlanoVooRepository;


@Component
public class LiberarVooServico {
    private IPlanoVooRepository planoVooRepository;

    @Autowired
    public LiberarVooServico(IPlanoVooRepository planoVooRepository) {
        this.planoVooRepository = planoVooRepository;
    }

    public LiberarPlanoDTO liberarPlanoDeVoo(PlanoDeVoo planoDeVoo) {

        if(planoVooRepository.verificaPlanoDeVoo(planoDeVoo)){
            return new LiberarPlanoDTO("não foi possível liberar o plano de voo");
        }
        return new LiberarPlanoDTO("plano de voo liberado com sucesso");        
    }
}
