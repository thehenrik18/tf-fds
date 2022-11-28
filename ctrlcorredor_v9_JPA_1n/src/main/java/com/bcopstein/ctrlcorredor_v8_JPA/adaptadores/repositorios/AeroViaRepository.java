package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IAeroviaRepository;

@Component
public class AeroViaRepository implements IAeroviaRepository {
private IAeroViaCRUD aeroviaCRUD;
   
     @Autowired
     public AeroViaRepository(IAeroViaCRUD aeroviaCRUD) {
          this.aeroviaCRUD = aeroviaCRUD;
          
     }

     @Override
     public AeroVia obterAeroVia(int idAeroVia) {
          return aeroviaCRUD.findById(idAeroVia);
     }
    
     }

      



