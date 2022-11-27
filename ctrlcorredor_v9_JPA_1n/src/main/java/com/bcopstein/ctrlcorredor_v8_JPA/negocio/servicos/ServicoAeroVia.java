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
        //aeroVia.IdsOcupacao=numeros;
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
        //aeroVia.IdsOcupacao=numeros;

        aerovias.add(aeroVia);
        
    }
}
