package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.controllers;

import java.util.Date;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarRotas;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarSlotsLivres;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.RotaDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.SlotsLivresDTO;
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
        
        return consultarRotas.run(origem,destino);
    }
    @GetMapping("/slotsLivres")
    @CrossOrigin(origins = "*")
    public SlotsLivresDTO consultarSlotsLivres(@RequestParam String idAeroVia,@RequestParam Date horaPartida){
        
        return consultarSlotsLivres.run( idAeroVia, horaPartida);
    }
    
}
