package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;


import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;

public interface IPlanoVooRepository {
    Boolean verificaPlanoDeVoo(PlanoDeVoo planoDeVoo);
    String liberaPlanoVoo(int idVoo);
    String cancelaPlanoVoo(int idVoo);
}
