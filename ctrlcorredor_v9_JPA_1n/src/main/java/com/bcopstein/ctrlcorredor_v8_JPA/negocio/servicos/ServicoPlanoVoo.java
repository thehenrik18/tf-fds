package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IPlanoVooRepository;

@Entity
public class ServicoPlanoVoo {
    private IPlanoVooRepository planoVooRep;

    @Autowired
    public ServicoPlanoVoo(IPlanoVooRepository planoVooRep) {
        this.planoVooRep = planoVooRep;
    }

    public void cadastra(PlanoDeVoo planoDeVoo){
        planoVooRep.cadastra(planoDeVoo);
    }

    public boolean remove(PlanoDeVoo planoDeVoo){
        return planoVooRep.remove(planoDeVoo);
    }
}
