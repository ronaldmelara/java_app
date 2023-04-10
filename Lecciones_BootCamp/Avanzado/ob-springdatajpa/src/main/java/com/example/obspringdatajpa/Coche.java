package com.example.obspringdatajpa;

import jakarta.persistence.*;

@Entity
public class Coche {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "anio", nullable = false)
    private Integer anio;
    //constructores

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer anio) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.anio = anio;
    }

    //getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    //to string


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + anio +
                '}';
    }
}
