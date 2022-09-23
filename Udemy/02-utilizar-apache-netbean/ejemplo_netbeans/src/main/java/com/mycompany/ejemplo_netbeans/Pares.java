/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_netbeans;

/**
 *
 * @author melaragalaz
 * Numero pares entre 1 y 10
 */
public class Pares {
    public static void main(String[] args)
    {
        System.out.println("WHILE");
        System.out.println("-----");
        
        int i = 1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            //System.out.println(i);
            i++;
        }
        
        //For
        System.out.println("FOR");
        System.out.println("---");
        
        for (int j = 1; j <= 10; j++) {
            if(j%2==0){
                System.out.println(j);
            }
            //System.out.println(j);
        }
        
        System.out.println("CON el truco for (int k = 2; k <= 10; k+=2), porque se que ira aumentando de 2 en 2");
        for (int k = 2; k <= 10; k+=2) {
            System.out.println(k);
        }
        
       
    }
}
