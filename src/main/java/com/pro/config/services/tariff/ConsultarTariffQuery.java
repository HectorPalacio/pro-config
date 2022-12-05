package com.pro.config.services.tariff;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.TariffEntity;

@Service
public class ConsultarTariffQuery {
    
    public TariffEntity consultarTariff(){

        TariffEntity  tariff = new TariffEntity();

        tariff.setIdTariff(1);
        tariff.setCostHour(2500);
        tariff.setIdSetting(1);

        return tariff;
    }
}
