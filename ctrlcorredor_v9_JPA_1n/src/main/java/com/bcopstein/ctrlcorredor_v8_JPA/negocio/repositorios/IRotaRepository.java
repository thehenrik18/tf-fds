package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import java.util.Date;
import java.util.List;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;


public interface IRotaRepository {
    List<Rota> todas();
    List<Integer> consultaSlotsLivres(int aeroViaId,Date hPartida,int velocidade,int sentido);
    Rota obterRota(int idRota);
}
