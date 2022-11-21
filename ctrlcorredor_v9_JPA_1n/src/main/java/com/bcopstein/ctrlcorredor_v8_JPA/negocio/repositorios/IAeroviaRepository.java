package com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios;

import java.util.Date;

public interface IAeroviaRepository {
    String gerarRelOcupAerovia(int aeroviaId,Date data);
}
