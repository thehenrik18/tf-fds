package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos.ServicoPlanoVoo;

@Component
public class CadastraPlanoVoo {
    private ServicoPlanoVoo servicoPlanoVoo;

    @Autowired
    public CadastraPlanoVoo(ServicoPlanoVoo servicoPlanoVoo) {
        this.servicoPlanoVoo = servicoPlanoVoo;
    }

    public void run (PlanoDeVoo planoDeVoo){
        servicoPlanoVoo.cadastra(planoDeVoo);
    }
    
}
