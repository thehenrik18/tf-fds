package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.controllers;

import java.util.Date;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarRotas;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.ConsultarSlotsLivres;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.LiberarPlanoVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.LiberarPlanoDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.RotaDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.dtos.SlotsLivresDTO;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.casosDeUso.CancelaPlanoVoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrlCorridas")
public class CtrlCorridasController {
   
    private ConsultarRotas consultarRotas;
    private ConsultarSlotsLivres consultarSlotsLivres;
    private LiberarPlanoVoo liberarPlanoVoo;
    private CancelaPlanoVoo cancelaPlanoVoo;
    
    @Autowired
    public CtrlCorridasController(
            ConsultarRotas consultarRotas,ConsultarSlotsLivres consultarSlotsLivres,
            LiberarPlanoVoo liberarPlanoVoo,
            CancelaPlanoVoo cancelaPlanoVoo
            ) {
        this.consultarRotas=consultarRotas;
        this.consultarSlotsLivres=consultarSlotsLivres;
        this.liberarPlanoVoo=liberarPlanoVoo;
        this.cancelaPlanoVoo=cancelaPlanoVoo;

    }
    
    @GetMapping("/rota")
    @CrossOrigin(origins = "*")
    public RotaDTO consultaRotas(@RequestParam String origem, @RequestParam String destino){
        
        return consultarRotas.run(origem,destino);
    }
    @PostMapping("/liberarPlano")
    @CrossOrigin(origins = "*")
    public LiberarPlanoDTO liberarPlanoDeVoo(@RequestBody final PlanoDeVoo planoDeVoo){
        
        return liberarPlanoVoo.run(planoDeVoo);
    }

    @PostMapping("/RemovePlano")
    @CrossOrigin(origins = "*")
    public boolean removePlano(@RequestBody final PlanoDeVoo planoDeVoo){
        
        return cancelaPlanoVoo.run(planoDeVoo);
    }
    
    @GetMapping("/slotsLivres")
    @CrossOrigin(origins = "*")
    public SlotsLivresDTO consultarSlotsLivres(@RequestParam int idAeroVia,@RequestParam Date horaPartida){
        
        return consultarSlotsLivres.run( idAeroVia, horaPartida);
    }
    
}
