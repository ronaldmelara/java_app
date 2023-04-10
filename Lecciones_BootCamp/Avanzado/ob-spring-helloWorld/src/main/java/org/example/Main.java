package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Ejemplo 1
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora =  (Calculadora) context.getBean("calculadora");
        String texto = calculadora.holaMundo();

        System.out.println(texto);


        //Ejemplo 2
        GestorFacturas gestor = (GestorFacturas)context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());
    }
}
