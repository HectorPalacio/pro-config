package com.pro.config.services.parker;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.ParkerEntity;

@Service
public class ConsultarParkerQuery {
    
    public ParkerEntity consultarParker(){

        ParkerEntity  parker = new ParkerEntity();

        parker.setIdSetting(1);
        parker.setTypeBay("Carros");
        parker.setTotalAbility(3000);
        parker.setCurrentAbility(20);

        return parker;
    }
}
