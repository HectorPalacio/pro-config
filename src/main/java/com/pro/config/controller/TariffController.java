package com.pro.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.config.model.entity.TariffEntity;
import com.pro.config.services.tariff.ConsultarTariffQuery;
import com.pro.config.services.tariff.EditarTariffCommand;
import com.pro.config.services.tariff.EliminarTariffCommand;
import com.pro.config.services.tariff.RegistrarTariffCommand;

@RestController
@RequestMapping(path = "/tariff")
public class TariffController {
    
    @Autowired
    RegistrarTariffCommand registrarTariffCommand;

    @Autowired
    ConsultarTariffQuery consultarTariffQuery;

    @Autowired
    EditarTariffCommand editarTariffCommand;

    @Autowired
    EliminarTariffCommand eliminarTariffCommand;

    @GetMapping
    @ResponseBody
    public TariffEntity consultarTariff(){
        return consultarTariffQuery.consultarTariff();
    }

    @PostMapping
	@ResponseBody
	public TariffEntity registrarTariff(@RequestBody TariffEntity tariff) {
        return registrarTariffCommand.registrarTariff(tariff);
	}

    @PutMapping
    @ResponseBody
    public TariffEntity editarTariff(@RequestBody TariffEntity tariff) {
        return editarTariffCommand.editarTariff(tariff);
    }

    @DeleteMapping
    @ResponseBody
    public Boolean eliminarTariff(@RequestBody TariffEntity tariff){
        return eliminarTariffCommand.eliminarTariff();
    }
}
