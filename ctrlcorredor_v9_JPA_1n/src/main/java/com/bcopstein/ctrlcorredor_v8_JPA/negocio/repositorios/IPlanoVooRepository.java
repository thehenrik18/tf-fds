package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;

public interface IPlanoVooRepository {
    void cadastra(PlanoDeVoo planoDeVoo);
    boolean remove(PlanoDeVoo planoDeVoo);
}
