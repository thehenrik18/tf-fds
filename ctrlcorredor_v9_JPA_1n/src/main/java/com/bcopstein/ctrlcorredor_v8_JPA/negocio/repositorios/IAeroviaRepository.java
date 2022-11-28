package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;
import java.util.List;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;

import java.util.Date;
public interface IAeroviaRepository {
    //String gerarRelOcupAerovia(int aeroviaId,Date data);
    //void salvarTodos(List<AeroVia> aerovias);
    AeroVia obterAeroVia(int idAeroVia);

}
