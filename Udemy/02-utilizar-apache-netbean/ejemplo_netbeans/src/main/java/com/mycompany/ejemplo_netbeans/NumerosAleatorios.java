/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_netbeans;

import java.util.Scanner;

/**
 *
 * @author melaragalaz
 */
public class NumerosAleatorios {
    /*
    Generar 10 numeros aletorios entre 1 y 10
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maximo = 10;
        int minimo = 1;
        
        int aleatorio;
        for (int i = 0; i < 10; i++) {
            aleatorio = (int)(Math.random() * (maximo - minimo +1)+minimo);
        
                System.out.println(aleatorio);
        }
        
    }
}
