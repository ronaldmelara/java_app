package com.openbootcamp.demospringrest.models;


/***
 * A ESTO SE LE LLAMA POJO : Plain Old Java Object
 */
public class Bootcamper {
    private String nombre;
    private double valor;

    public Bootcamper(){ }

    public Bootcamper(String nombre) {
        this.nombre = nombre;
        this.valor = Math.random();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
