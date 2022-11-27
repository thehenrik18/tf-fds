package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Rota{
  @Id
  private String idRota;
  private String idOrigemAero;// uma rota tem um inicio e um fim, sendo esses locais dois aeroportos distintos
  private  String idDestinoAero;
 

  public Rota(String idRota, String origem, String destino) {
    this.idRota = idRota;
    this.idOrigemAero = origem;
    this.idDestinoAero = destino;
    this.IdsAerovias=new ArrayList<AeroVia>();
  }

  public Rota(){}
  
  @OneToMany(fetch = FetchType.EAGER,
  cascade = CascadeType.ALL)
  @JoinTable(name = "rota_aeroVia",joinColumns = {@JoinColumn(name="idRota")},inverseJoinColumns = 
  {@JoinColumn(name="idAeroVia")})
   private List<AeroVia> IdsAerovias;
 public String getIdRota() {
     return idRota;
 }

  public List<AeroVia> getIdsAerovias() {
      return IdsAerovias;
  }
 public String getDestino() {
     return idDestinoAero;
 }
 public String getOrigem() {
     return idOrigemAero;
 }
}