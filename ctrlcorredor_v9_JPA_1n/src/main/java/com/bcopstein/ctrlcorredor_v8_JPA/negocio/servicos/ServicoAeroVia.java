package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IAeroviaRepository;

@Component
public class ServicoAeroVia {
    private IAeroviaRepository aeroviaRepository;

    @Autowired
    public ServicoAeroVia(IAeroviaRepository aeroviaRepository) {
        this.aeroviaRepository = aeroviaRepository;
    }
  
    public AeroVia obterAeroVia(int idAeroVia){
        return aeroviaRepository.obterAeroVia(idAeroVia); 
    } 
}
