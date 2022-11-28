package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;

public interface IPlanoVooCRUD extends CrudRepository<PlanoDeVoo, Integer> {
    void delete(PlanoDeVoo PlanoVoo);
}
    

