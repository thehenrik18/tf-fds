package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;


public interface IRotaCRUD extends CrudRepository<Rota,String> {
    List<Rota> findAll();
}
