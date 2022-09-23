/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_netbeans;

import java.util.Scanner;

/**
 *
 * @author melaragalaz
 * Mostrar caracteres de una cadena uno a uno
 */
public class RecorrerCadena {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Inserta una frase:");
        String frase = sc.next();
        
        
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            System.out.println(caracter);
        }
    }
}
