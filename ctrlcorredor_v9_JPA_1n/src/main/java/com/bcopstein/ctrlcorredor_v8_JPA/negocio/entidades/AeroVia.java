package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AeroVia {
    @Id
   public  String idAeroVia;
   public  float LongOrigem;
   public float latiOrigem;
   public float LongDestino;
   public float latiDestino;
   public float distancia;
   public List<Integer> IdsOcupacao;
   public int sentido;

public AeroVia(String idAeroVia, float longOrigem, float latiOrigem, float longDestino, float latiDestino, float distancia,
            List<Integer> ocupacao, int sentido) {
        this.idAeroVia = idAeroVia;
        LongOrigem = longOrigem;
        this.latiOrigem = latiOrigem;
        LongDestino = longDestino;
        this.latiDestino = latiDestino;
        this.distancia = distancia;
        this.IdsOcupacao = ocupacao;
        this.sentido = sentido;
    }
    public AeroVia(){
    }
public float getLatiDestino() {
    return latiDestino;
}
public float getLatiOrigem() {
    return latiOrigem;
}
public float getLongDestino() {
    return LongDestino;
}
public float getLongOrigem() {
    return LongOrigem;
}
    public float getDistancia() {
        return distancia;
    }
    public String getIdAeroVia() {
        return idAeroVia;
    }
    public List<Integer> getOcupacao() {
        return IdsOcupacao;
    }
 
    public int getSentido() {
        return sentido;
    }
}
