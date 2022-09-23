package com.company;

public class ArrayMain {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        nombres[0]="nombre 1";
        nombres[1]="nombre 2";
        nombres[2]="nombre 3";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
