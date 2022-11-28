package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos.ServicoPlanoVoo;

@Component
public class CancelaPlanoVoo {
    private ServicoPlanoVoo servicoPlanoVoo;

    @Autowired
    public CancelaPlanoVoo(ServicoPlanoVoo servicoPlanoVoo) {
        this.servicoPlanoVoo = servicoPlanoVoo;
    }

    public  boolean run (PlanoDeVoo planoDeVoo){
        return servicoPlanoVoo.remove(planoDeVoo);
    }
}
