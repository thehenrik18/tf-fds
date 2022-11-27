package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos;

import java.util.List;

public class RotaDTO{
 private List<String>nomeRotas;

 public RotaDTO(List<String>nomeRotas){
     this.nomeRotas=nomeRotas;
 }
 public RotaDTO(){
    
 }
 public List<String> getNomeRotas(){
     return nomeRotas;
 }
    
}