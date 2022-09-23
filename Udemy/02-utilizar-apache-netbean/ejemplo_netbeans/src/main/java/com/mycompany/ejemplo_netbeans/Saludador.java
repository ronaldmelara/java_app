/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_netbeans;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author melaragalaz
 */
public class Saludador {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe un nombre");
        String nombre = sc.next();
        
        System.out.println("!Hola " +  nombre + "!!");
    }
    
}
