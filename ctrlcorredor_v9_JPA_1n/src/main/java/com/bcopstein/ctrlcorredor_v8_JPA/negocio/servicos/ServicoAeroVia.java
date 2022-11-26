package com.bcopstein.ctrlcorredor_v8_JPA.negocio.servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.AeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IAeroviaRepository;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IocupacaoRepository;

@Component
public class ServicoAeroVia {
    private IAeroviaRepository aeroviaRepository;
    private IocupacaoRepository ocupacaoRepository;

    @Autowired
    public ServicoAeroVia(IAeroviaRepository aeroviaRepository) {
        this.aeroviaRepository = aeroviaRepository;
    }
    public String gerarRelOcupAerovia(int aeroviaId,Date data){
        return aeroviaRepository.gerarRelOcupAerovia(aeroviaId,data);
    }
    public AeroVia obterAeroVia(String idAeroVia){
        return aeroviaRepository.obterAeroVia(idAeroVia); 
    }

    public List<Integer> ConsultarSlotsLivres(String idAeroVia,Date horaPartida){
        
        //obtém a aerovia com base no identificador
        AeroVia escolhida= aeroviaRepository.obterAeroVia(idAeroVia);

        //instancia uma lista com os slots ocupados
        List<Integer>ocupados=new ArrayList<Integer>();

        //instancia uma lista com os slots livres
        List<Integer> disponiveis=new ArrayList<Integer>();

        //para cada id pega a ocupacao
        //apenas se a hora for a mesma que a hora de partida
        //pois só assim estaria ocupado
        for (Integer idOcupacao : escolhida.IdsOcupacao) {
            OcupacaoAeroVia ocupado=ocupacaoRepository.obterOcupacao(idOcupacao);
            if(ocupado.getData()==horaPartida){
                ocupados.add(ocupado.getAltitude());
            }
        }
        
        //popula a lista de disponiveis com todas as altitudes possiveis
        for(int i=1;i<=10;i++){disponiveis.add(i);}

        //remove todas as altitudes ocupadas da lista de disponiveis
        disponiveis.removeAll(ocupados);
       
        //retorna os disponiveis
        return disponiveis;        
    }

    public void populaListaAerovias(){
        List<AeroVia> aerovias = new ArrayList<>();
        List<Integer>numeros=new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        AeroVia aeroVia=new AeroVia();
        aeroVia.idAeroVia="A1";
        aeroVia.LongOrigem=1;
        aeroVia.latiOrigem=1;
        aeroVia.LongDestino=2;
        aeroVia.latiDestino=2;
        aeroVia.distancia=1;
        aeroVia.IdsOcupacao=numeros;
        aerovias.add(aeroVia);


        aeroVia.idAeroVia="A2";
        aeroVia.LongOrigem=4;
        aeroVia.latiOrigem=4;
        aeroVia.LongDestino=4;
        aeroVia.latiDestino=4;
        aeroVia.distancia=5;
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        aeroVia.IdsOcupacao=numeros;

        aerovias.add(aeroVia);
        
    }
}
