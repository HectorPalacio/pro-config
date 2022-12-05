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

import com.pro.config.model.entity.ParkerEntity;
import com.pro.config.services.parker.ConsultarParkerQuery;
import com.pro.config.services.parker.EditarParkerCommand;
import com.pro.config.services.parker.EliminarParkerCommand;
import com.pro.config.services.parker.RegistrarParkerCommand;

@RestController
@RequestMapping(path = "/parker")
public class ParkerController {

    @Autowired
    RegistrarParkerCommand registrarParkerCommand;

    @Autowired
    ConsultarParkerQuery consultarParkerQuery;

    @Autowired
    EditarParkerCommand editarParkerCommand;

    @Autowired
    EliminarParkerCommand eliminarParkerCommand;

    @GetMapping
    @ResponseBody
    public ParkerEntity consultarParker(){
        return consultarParkerQuery.consultarParker();
    }

    @PostMapping
	@ResponseBody
	public ParkerEntity registrarParker(@RequestBody ParkerEntity parker) {
        return registrarParkerCommand.registrarParker(parker);
	}

    @PutMapping
    @ResponseBody
    public ParkerEntity editarParker(@RequestBody ParkerEntity parker) {
        return editarParkerCommand.editarParker(parker);
    }

    @DeleteMapping
    @ResponseBody
    public Boolean eliminarParker(@RequestBody ParkerEntity parker){
        return eliminarParkerCommand.eliminarParker();
    }
}
