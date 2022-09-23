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
public class Bisiesto {
    public static void main(String[] args){
        /*
            V & V = V
            V & F = F
            F & V = F
            F & F = F
        
            V | V = V
            V | F = V
            F | V = V
            F | F = F
        */
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Inserta una anio:");
        int anio = sc.nextInt();
        
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        
        
    }
}
