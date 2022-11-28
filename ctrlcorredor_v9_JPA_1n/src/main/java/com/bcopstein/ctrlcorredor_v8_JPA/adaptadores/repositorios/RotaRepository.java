package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IRotaRepository;


@Component
public class RotaRepository implements IRotaRepository {
    private IRotaCRUD rotaCrud;

    @Autowired
    public RotaRepository(IRotaCRUD rotaCrud) {
        this.rotaCrud = rotaCrud;
    }

    @Override
    public List<Rota> todas() {
        return rotaCrud.findAll();
    }

  
    
    @Override
    public Rota obterRota(int idRota) {
        return rotaCrud.findById(idRota);
    }



   

    
}
