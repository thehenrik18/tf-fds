package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.OcupacaoAeroVia;

public interface IocupacaoRepository {
    OcupacaoAeroVia obterOcupacao(int idOcupacao);
}
