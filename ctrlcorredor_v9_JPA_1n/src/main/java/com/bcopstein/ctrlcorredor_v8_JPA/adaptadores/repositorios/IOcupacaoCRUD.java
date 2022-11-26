package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;

public interface IOcupacaoCRUD extends CrudRepository<OcupacaoAeroVia,String>{
    OcupacaoAeroVia findById(int idOcupacao);
}
