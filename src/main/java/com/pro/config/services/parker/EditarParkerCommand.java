package com.pro.config.services.parker;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.ParkerEntity;

@Service
public class EditarParkerCommand {
    
    public ParkerEntity editarParker(ParkerEntity parker){

        ParkerEntity  currentParker = new ParkerEntity();
        currentParker.setIdSetting(1);
        currentParker.setTypeBay("Carros");
        currentParker.setTotalAbility(3000);
        currentParker.setCurrentAbility(20);

        ParkerEntity updatedParker = new ParkerEntity();
        updatedParker.setIdSetting(parker.getIdSetting());
        updatedParker.setTypeBay(parker.getTypeBay());
        updatedParker.setTotalAbility(parker.getTotalAbility());
        updatedParker.setCurrentAbility(parker.getCurrentAbility());

        return updatedParker;
    }
}
