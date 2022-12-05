package com.pro.config.services.tariff;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.TariffEntity;

@Service
public class EditarTariffCommand {

    public TariffEntity editarTariff(TariffEntity tariff){

        TariffEntity  currentTariff = new TariffEntity();
        currentTariff.setIdTariff(1);
        currentTariff.setCostHour(2500);
        currentTariff.setIdSetting(1);

        TariffEntity updatedTariff = new TariffEntity();
        updatedTariff.setIdTariff(tariff.getIdTariff());
        updatedTariff.setCostHour(tariff.getCostHour());
        updatedTariff.setIdSetting(tariff.getIdSetting());

        return updatedTariff;
    }
}
