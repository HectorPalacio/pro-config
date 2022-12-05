package com.pro.config.services.parker;

import org.springframework.stereotype.Service;

import com.pro.config.model.entity.ParkerEntity;

@Service
public class RegistrarParkerCommand {
    
    public ParkerEntity registrarParker(ParkerEntity parker){
        
        return parker;
    }
}