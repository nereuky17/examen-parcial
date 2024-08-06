package com.cic.ejercicio4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity

public class Peliculas {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Size(max=100)
private String contenido;

@ManyToOne(optional = false)
@JoinColumn(name = "director_id")

private Director director;

public Peliculas() {
}

public Peliculas(@Size(max = 100) String contenido, Director director) {
    this.contenido = contenido;
    this.director = director;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getContenido() {
    return contenido;
}

public void setContenido(String contenido) {
    this.contenido = contenido;
}

public Director getDirector() {
    return director;
}

public void setDirector(Director director) {
    this.director = director;
}












}
