package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IocupacaoRepository;

public class OcupacaoRepository implements IocupacaoRepository{
    private IOcupacaoCRUD ocupacaoCRUD;

    @Autowired
    public OcupacaoRepository(IOcupacaoCRUD ocupacaoCRUD) {
        this.ocupacaoCRUD = ocupacaoCRUD;
    }
 
    @Override
    public OcupacaoAeroVia obterOcupacao(int idOcupacao) {
        return this.ocupacaoCRUD.findById( idOcupacao);
    }

    @Override
    public void salvar(OcupacaoAeroVia ocupacao) {
         this.ocupacaoCRUD.save(ocupacao);
        
    }

     
}
