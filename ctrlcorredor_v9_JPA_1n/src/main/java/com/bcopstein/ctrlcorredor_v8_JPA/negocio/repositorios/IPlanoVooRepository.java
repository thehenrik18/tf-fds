package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import java.util.Date;

public interface IPlanoVooRepository {
    String verificaPlanoDeVoo(Date data,Date hPartida,
    int idVoo,String nomeRota,int velocidade,int sentidoAeroVia
    );
    String liberaPlanoVoo(int idVoo);
    String cancelaPlanoVoo(int idVoo);
}
