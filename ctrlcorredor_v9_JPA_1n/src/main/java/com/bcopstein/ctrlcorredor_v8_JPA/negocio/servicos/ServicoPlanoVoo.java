package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios.IAeroViaCRUD;
import com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios.AeroViaRepository;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IPlanoVooRepository;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IRotaRepository;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IocupacaoRepository;

@Component
public class ServicoPlanoVoo {
    private IPlanoVooRepository planoVooRepository;
    private IRotaRepository rotaRepository;
    private IocupacaoRepository ocupacaoRepository;
    private AeroViaRepository aeroViaRepository;
    

    @Autowired
    public ServicoPlanoVoo(IPlanoVooRepository planoVooRepository) {
        this.planoVooRepository = planoVooRepository;
    }

 
   }

