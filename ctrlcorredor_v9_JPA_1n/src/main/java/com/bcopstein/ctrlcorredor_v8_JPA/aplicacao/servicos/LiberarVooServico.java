package com.bcopstein.ctrlcorredor_v8_JPA.aplicacao.servicos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios.IPlanoVooCRUD;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.Rota;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IRotaRepository;


@Component
public class LiberarVooServico {

    private IRotaRepository rotaRepository;
 
    @Autowired
    public LiberarVooServico(IRotaRepository rotaRepository) {
        this.rotaRepository = rotaRepository;
    }

    public Boolean liberarPlanoDeVoo(PlanoDeVoo planoDeVoo) {
    //pega a rota desejada pelo id
    Rota rota=rotaRepository.obterRota(planoDeVoo.getIdRota());

    //pega o horario desejado do voo
     int horario=planoDeVoo.getHora();

     //para cada aerovia desta rota verifica se possui ocupacao
     for(AeroVia aeroVia:rota.getAerovias()){
         if(!verificaAeroVia(horario, aeroVia, planoDeVoo.getAltitude(),
             planoDeVoo.getData())){
             return false;
         }
         //atualiza o horario com base no calculo do tempo necessario para chegar ao fim da aeroVia
         //para partir deste ponto com outra aeroVia
         //método ceil arredonda pra cima a distancia para não quebrar 
         int somaHorario=calcHoras((int) Math.ceil(aeroVia.getDistancia()) , planoDeVoo.getVelocidadeCruzeiro());
         horario=somaHorario+planoDeVoo.getHora();
     }

     return true;
      
    }
    public boolean verificaAeroVia(int hora,AeroVia aeroVia,int altitude,Date data){

        //percorre todas Ocupacoes da aeroVia em especifico
        for(OcupacaoAeroVia ocupacao:aeroVia.getOcupacoes()){

            //se possuir uma ocupacao nos mesmos data,horario e altitude retorna false
            if(ocupacao.getData().equals(data) && ocupacao.getHora()==hora &&
            ocupacao.getAltitude()==altitude){
                return false;
            }
        }
        return true;     
    } 
    public int calcHoras(int distancia, int velocidade){
        double tempo = distancia/velocidade;

        //método ceil arredonda para cima os slots
        int horas=(int) Math.ceil(tempo);
        return horas;//quantidade de slots nescessários
      }

}
