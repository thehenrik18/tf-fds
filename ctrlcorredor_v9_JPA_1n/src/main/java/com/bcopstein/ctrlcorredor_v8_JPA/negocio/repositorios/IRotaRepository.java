package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import java.util.Date;
import java.util.List;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;


public interface IRotaRepository {
    List<Rota> todas();
    Rota obterRota(int idRota);
}
