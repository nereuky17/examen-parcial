package com.cic.ejercicio4.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 100)
    private String nombre;

    @OneToMany(mappedBy = "director", cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })

    private List<Peliculas> peliculas = new ArrayList<>();

    private int año;

    public Director() {
    }

    public Director(@Size(max = 100) String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
