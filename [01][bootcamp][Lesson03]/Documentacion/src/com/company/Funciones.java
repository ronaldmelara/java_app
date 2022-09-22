package com.company;

public class Funciones {
    public static void main(String[] args) {

        HolaMundo();
        System.out.println(devolverHolaMundo());
        HolaMundo("Ronald");
    }

    public static void HolaMundo() {
        System.out.println("Hola Mundo desde un metodo");
    }

    private static void HolaMundo(String nombre) {
        System.out.println("Hola Mundo desde un metodo " + nombre);
    }
    private static String devolverHolaMundo(){
        return "Hola mundo desde un metodo con retorno";
    }


}
