package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.List;

public class AeroVia {
    String idAeroVia;
    RefGeo origem;
    RefGeo destino;
    float distancia;
    List<OcupacaoAeroVia> ocupacao;
    int sentido;

    public AeroVia(String idAeroVia, RefGeo origem, RefGeo destino, float distancia, List<OcupacaoAeroVia> ocupacao,
            int sentido) {
        this.idAeroVia = idAeroVia;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.ocupacao = ocupacao;
        this.sentido = sentido;
    }
    public AeroVia(){
    }
    public RefGeo getDestino() {
        return destino;
    }
    public float getDistancia() {
        return distancia;
    }
    public String getIdAeroVia() {
        return idAeroVia;
    }
    public List<OcupacaoAeroVia> getOcupacao() {
        return ocupacao;
    }
    public RefGeo getOrigem() {
        return origem;
    }
    public int getSentido() {
        return sentido;
    }
}
