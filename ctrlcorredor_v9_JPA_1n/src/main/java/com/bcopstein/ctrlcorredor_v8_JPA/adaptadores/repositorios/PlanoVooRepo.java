package com.bcopstein.ctrlcorredor_v8_JPA.adaptadores.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.ctrlcorredor_v8_JPA.negocio.entidades.PlanoDeVoo;
import com.bcopstein.ctrlcorredor_v8_JPA.negocio.repositorios.IPlanoVooRepository;
@Component
public class PlanoVooRepo implements IPlanoVooRepository {
    private IPlanoVooCRUD planoVooCRUD;

    @Autowired
    public PlanoVooRepo(IPlanoVooCRUD planoVooCRUD) {
        this.planoVooCRUD = planoVooCRUD;
    }

    @Override
    public void cadastra(PlanoDeVoo planoDeVoo) {
        this.planoVooCRUD.save(planoDeVoo);        
    }

    @Override
    public boolean remove(PlanoDeVoo planoDeVoo) {
        
        if(planoVooCRUD.existsById(planoDeVoo.getIdVoo())) {
            planoVooCRUD.delete(planoDeVoo);
            return true;
        }
        return false;
        }
    
    
}
