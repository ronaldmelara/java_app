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
public class Operaciones {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe el numero 1");
        int num1 = sc.nextInt();
        
        System.out.println("Escribe el numero 2");
        int num2 = sc.nextInt();
        
        int suma = num1+num2;
        System.out.println("La suma es: " + suma);
        
        int resta = num1 -num2;
        System.out.println("La resta es: " + resta);
        
        int mult = num1 * num2;
        System.out.println("La multiplicacion  es: " + mult);
        
        if(num2 == 0){
            System.out.println("No puedes dividir entre 0");
        }else{
            double division = (double)num1 / (double)num2;
        System.out.println("La division es: " + division);
        }
        
    }
}
