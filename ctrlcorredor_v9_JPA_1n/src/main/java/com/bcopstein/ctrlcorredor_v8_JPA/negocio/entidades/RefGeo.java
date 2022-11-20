package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RefGeo {
    @Id
    int idRefGeo;
    float latitude;
    float longitude;

    public RefGeo(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public RefGeo(){
    }
    public float getLatitude() {
        return latitude;
    }
    public float getLongitude() {
        return longitude;
    }
    public int getIdRefGeo() {
        return idRefGeo;
    }
    

}
