package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IAeroviaRepository;

@Component
public class SlotsDTOServico {
    private IAeroviaRepository aeroviaRepository;

    @Autowired
    public SlotsDTOServico(IAeroviaRepository aeroviaRepository) {
        this.aeroviaRepository = aeroviaRepository;
    }

    public List<Integer> ConsultarSlotsLivres(int idAeroVia, Date horaPartida) {
        
    AeroVia aeroVia= aeroviaRepository.obterAeroVia(idAeroVia);
     //obtem a respectiva aerovia com sua pk
     AeroVia escolhida= aeroviaRepository.obterAeroVia(idAeroVia);

     //instancia uma lista que guardará os slots ocupados  
     List<Integer>ocupados=new ArrayList<Integer>();

    //instancia uma lista com os slots que serão disponiveis
     List<Integer> disponiveis=new ArrayList<Integer>();

     //para cada ocupacao da aerovia
     for (OcupacaoAeroVia Ocupacao : escolhida.getOcupacoes()) {
         
         //se a data de partida for igual a data contida nesta ocupacao
         //então o slot esta ocupado e é adicionado a lista de ocupados
         if(Ocupacao.getData()==horaPartida){
             ocupados.add(Ocupacao.getAltitude());
         }
     }
     
     //popula a lista de disponiveis com todas altitudes disponiveis
     for(int i=1;i<=10;i++){disponiveis.add(i);}

     //remove todos os elementos ocupados da lista de disponiveis
     disponiveis.removeAll(ocupados);
     return disponiveis;
    }
}
