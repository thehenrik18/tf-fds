package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AeroPorto {
    @Id
    String nome;
    float latitude;
    float longitude;
    String localizacao;

   public AeroPorto (String nome, float latitude, float longitude, String localizacao) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.localizacao = localizacao;
    }
    public AeroPorto(){
    }
    
   public float getLatitude() {
       return latitude;
   }
   public float getLongitude() {
       return longitude;
   }
    public String getLocalizacao() {
        return localizacao;
    }
    public String getNome() {
        return nome;
    }

}
