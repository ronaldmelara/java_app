package com.company;

public class StringMain {
    public static void main(String[] args) {
        String mensaje = "Hola mundo";
        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY) ;
        System.out.println(mensajeMAY.trim());
        String otro = "HOLA MUNDO";
        System.out.println(mensaje.equals(otro));

    }
}