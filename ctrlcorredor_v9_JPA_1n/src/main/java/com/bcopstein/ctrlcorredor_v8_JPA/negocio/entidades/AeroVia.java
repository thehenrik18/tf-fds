package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class AeroVia {
   @Id
   public  int idAeroVia;
   public String nome;
   public  float LongOrigem;
   public float latiOrigem;
   public float LongDestino;
   public float latiDestino;
   public float distancia;
   public int sentido;


   public AeroVia(int idAeroVia, String nome, float longOrigem, float latiOrigem, float longDestino, float latiDestino,
         float distancia, int sentido) {
      this.idAeroVia = idAeroVia;
      this.nome = nome;
      LongOrigem = longOrigem;
      this.latiOrigem = latiOrigem;
      LongDestino = longDestino;
      this.latiDestino = latiDestino;
      this.distancia = distancia;
      this.sentido = sentido;
    }

    public AeroVia(){
    }
    @OneToMany(fetch = FetchType.EAGER,
    cascade = CascadeType.ALL)
    @JoinTable(name = "aerovia_ocupacao",joinColumns = {@JoinColumn(name="idAeroViabuceta")},inverseJoinColumns = 
    {@JoinColumn(name="idSlots")})
     private List<OcupacaoAeroVia> ocupacoes;

public float getLatiDestino() {
    return latiDestino;
}
public void addOcupacao(OcupacaoAeroVia ocupacao){
    this.ocupacoes.add(ocupacao);
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
    public int getIdAeroVia() {
        return idAeroVia;
    }
    public String getNome() {
        return nome;
    }
    public List<OcupacaoAeroVia> getOcupacoes() {
        return ocupacoes;
    }
 
    public int getSentido() {
        return sentido;
    }
}
