package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.LiberarPlanoDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos.LiberarVooServico;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;

@Component
public class LiberarPlanoVoo {
private LiberarVooServico liberarVooServico;
    
    public LiberarPlanoVoo(LiberarVooServico liberarVooServico) {
        this.liberarVooServico = liberarVooServico;
    }
    public LiberarPlanoDTO run(PlanoDeVoo planoDeVoo) {
        return liberarVooServico.liberarPlanoDeVoo(planoDeVoo);
    }
}
