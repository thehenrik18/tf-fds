package com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades;

public class AeroPorto {
    String nome;
    int idRefgeo;
    String localizacao;

    public AeroPorto(String nome, int idRefgeo, String localizacao) {
        this.nome = nome;
        this.idRefgeo = idRefgeo;
        this.localizacao = localizacao;
    }
    public AeroPorto(){
    }
    
    public int getIdRefgeo() {
        return idRefgeo;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public String getNome() {
        return nome;
    }

}
