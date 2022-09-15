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
public class Palindromo {
    /*
    pide una frase por consola e indica si es palindromo
    Es palindromo cuando se lee una frase igual de Izq a der que de der a izq.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Escribe una palabra o frase:");
        String frase = sc.next().trim();
        
        String invertida ="";
        char ch;
        for (int i = frase.length() -1; i >= 0; i--) {
            ch = frase.charAt(i);
            invertida += ch;
        }
        
        if (frase.equals(invertida)) {
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        
        //System.out.println("Invertida: " + invertida);
    }
}
