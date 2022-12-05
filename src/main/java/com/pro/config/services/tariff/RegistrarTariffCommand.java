package com.pro.config.services.tariff;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.TariffEntity;

@Service
public class RegistrarTariffCommand {
    
    public TariffEntity registrarTariff(TariffEntity tariff){
        
        return tariff;
    }
}
