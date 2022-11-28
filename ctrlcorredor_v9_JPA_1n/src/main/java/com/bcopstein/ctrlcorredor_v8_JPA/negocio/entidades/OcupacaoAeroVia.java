package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OcupacaoAeroVia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idOcupacao;
    Date data;
    int altitude;
    int hora;
    
    public OcupacaoAeroVia(Date data, int altitude,  int hora) {
        this.data = data;
        this.altitude = altitude;
        this.hora = hora;
    }
    public OcupacaoAeroVia(){
    }
    public int getAltitude() {
        return altitude;
    }
    public Date getData() {
        return data;
    }
    public int getHora() {
        return hora;
    }
    public int getIdOcupacao() {
        return idOcupacao;
    }

}
