package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rota{
  @Id
  private String nome;
  private String origem;// uma rota tem um inicio e um fim, sendo esses locais dois aeroportos distintos
  private  String destino;
 
  public Rota(String nome, String origem, String destino){
    this.nome = nome;
    this.origem=origem;
    this.destino=destino;
  }

  public Rota(){}
  
  public String getNome() {
    return nome;
  }
  public String getOrigem() {
      return origem;
  }
  public String getDestino() {
      return destino;
  }
}