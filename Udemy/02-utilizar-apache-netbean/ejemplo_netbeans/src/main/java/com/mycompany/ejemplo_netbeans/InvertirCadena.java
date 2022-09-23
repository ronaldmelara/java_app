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
public class InvertirCadena {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Escribe una palabra o frase:");
        String frase = sc.next();
        
        String invertida ="";
        char ch;
        for (int i = frase.length() -1; i >= 0; i--) {
            ch = frase.charAt(i);
            invertida += ch;
        }
        
        System.out.println("Invertida: " + invertida);
    }
}
