package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Rota{
  @Id
  private String idRota;
  private String idOrigemAero;// uma rota tem um inicio e um fim, sendo esses locais dois aeroportos distintos
  private  String idDestinoAero;
  private List<String> idsAerovias;
 

  public Rota(String idRota, String origem, String destino, List<String> idsAerovias) {
    this.idRota = idRota;
    this.idOrigemAero = origem;
    this.idDestinoAero = destino;
    this.idsAerovias = idsAerovias;
  }

  public Rota(){}
  
 public String getIdRota() {
     return idRota;
 }

  public List<String> getIdsAerovias() {
      return idsAerovias;
  }
 public String getDestino() {
     return idDestinoAero;
 }
 public String getOrigem() {
     return idOrigemAero;
 }
}