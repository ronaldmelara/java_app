package org.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    Calculadora calculadora;
    String nombre;

    public GestorFacturas(Calculadora calculadora){
        System.out.println("Ejecutamdo contructor GestorFacturas");
        this.calculadora = calculadora;
        this.nombre = "";
        System.out.println(this.nombre);
    }


}
