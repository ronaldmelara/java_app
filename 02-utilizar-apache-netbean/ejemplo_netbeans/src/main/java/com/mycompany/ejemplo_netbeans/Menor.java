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
public class Menor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Inserta el primer numero");
        int num1 = sc.nextInt();
        
        System.out.println("Inserta el segundo numero");
        int num2 = sc.nextInt();
        
        if(num1 <= num2){
            if(num1==num2){
                System.out.println("el num1 y el num2 son iguales");
            }else{
                System.out.println("el num1 es menor que el num2");
            }
            
        }else{
            System.out.println("el num2 es menor que el num1");
        }
    }
}
