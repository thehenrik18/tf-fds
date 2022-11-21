package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OcupacaoAeroVia {
    @Id
    int idOcupacao;
    Date data;
    int altitude;
    Date hora;
    
    public OcupacaoAeroVia(Date data, int altitude, int idOcupacao, Date hora) {
        this.data = data;
        this.altitude = altitude;
        this.idOcupacao = idOcupacao;
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
    public Date getHora() {
        return hora;
    }
    public int getIdOcupacao() {
        return idOcupacao;
    }

}
