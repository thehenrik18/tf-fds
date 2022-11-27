package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.controllers;

import java.util.Date;
import java.util.List;


import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarRotas;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarSlotsLivres;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.RotaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrlCorridas")
public class CtrlCorridasController {
   
    private ConsultarRotas consultarRotas;
    private ConsultarSlotsLivres consultarSlotsLivres;
    
    @Autowired
    public CtrlCorridasController(
            ConsultarRotas consultarRotas) {
        this.consultarRotas=consultarRotas;
    }
    
    @GetMapping("/rota")
    @CrossOrigin(origins = "*")
    public RotaDTO consultaRotas(@RequestParam String origem, @RequestParam String destino){
        //String origem="a";
        //String destino="b";
        return consultarRotas.run(origem,destino);
    }
    @GetMapping("/slotsLivres")
    @CrossOrigin(origins = "*")
    public List<Integer> consultarSlotsLivres(@RequestParam String idAeroVia,@RequestParam Date horaPartida){
        //String origem="a";
        //String destino="b";
        return consultarSlotsLivres.run( idAeroVia, horaPartida);
    }
    
}
