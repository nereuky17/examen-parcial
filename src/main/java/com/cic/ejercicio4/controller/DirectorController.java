package com.cic.ejercicio4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.ejercicio4.entity.Director;
import com.cic.ejercicio4.service.DirectorService;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    DirectorService directorService;
    //Método crear
@PostMapping(value="/crear")
public long crear(@RequestBody Director director){
    
}

    //Método leer
    //Método listar
    //Método actualizar
    //Método borrar

}
