package com.cic.ejercicio4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.ejercicio4.repository.DirectorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;
    //Método crear



    //Método leer
    //Método listar
    //Método actualizar
    //Método borrar

}
