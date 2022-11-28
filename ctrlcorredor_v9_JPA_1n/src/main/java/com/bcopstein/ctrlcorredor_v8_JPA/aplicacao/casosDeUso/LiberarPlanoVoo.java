package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso;

import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.LiberarPlanoDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos.LiberarVooServico;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos.ServicoPlanoVoo;


@Component
public class LiberarPlanoVoo {
private LiberarVooServico liberarVooServico;
private ServicoPlanoVoo servicoPlanoVoo;
    
    public LiberarPlanoVoo(LiberarVooServico liberarVooServico,ServicoPlanoVoo servicoPlanoVoo) {
        this.liberarVooServico = liberarVooServico;
        this.servicoPlanoVoo=servicoPlanoVoo;
    }
    public LiberarPlanoDTO run(PlanoDeVoo planoDeVoo) {
        if(!liberarVooServico.liberarPlanoDeVoo(planoDeVoo)){
            return new LiberarPlanoDTO("não foi possivel liberar o plano de voo");
        }
        servicoPlanoVoo.cadastra(planoDeVoo);
        return new LiberarPlanoDTO("plano de voo liberado com sucesso");
    }
}
