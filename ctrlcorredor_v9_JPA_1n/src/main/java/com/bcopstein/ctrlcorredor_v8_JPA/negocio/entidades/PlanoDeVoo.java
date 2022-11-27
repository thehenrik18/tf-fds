package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlanoDeVoo {
    @Id
    int idVoo;
    Date data;
    int altitude;
    int idRota;
    int velocidadeCruzeiro;
    int hora;

    public PlanoDeVoo(Date data, int altitude, int idRota, int velocidadeCruzeiro, int hora, int idVoo) {
        this.data = data;
        this.altitude = altitude;
        this.idRota = idRota;
        this.velocidadeCruzeiro = velocidadeCruzeiro;
        this.hora = hora;
        this.idVoo = idVoo;
    }
    public PlanoDeVoo(){
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
    public int getIdRota() {
        return idRota;
    }
    public int getIdVoo() {
        return idVoo;
    }
    public int getVelocidadeCruzeiro() {
        return velocidadeCruzeiro;
    }
}
