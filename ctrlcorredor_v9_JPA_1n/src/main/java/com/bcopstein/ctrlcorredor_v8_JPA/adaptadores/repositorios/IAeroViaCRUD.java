package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;

public interface IAeroViaCRUD extends CrudRepository<AeroVia,String> {
    Optional<AeroVia> findById(String idAeroVia);
}
