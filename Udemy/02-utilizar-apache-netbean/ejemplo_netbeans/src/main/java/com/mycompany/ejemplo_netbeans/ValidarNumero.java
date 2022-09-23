package com.mycompany.ejemplo_netbeans;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melaragalaz
 */
public class ValidarNumero {
    /*
    Pide un numero por consola y valida que es numero entre 0 y 10
    Hazlo con un do-while
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num; 
        
        do{
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            
            if(!(num>=0 && num<=10)){
                System.out.println("Debes de escribir un numero entre 0 y 10");
            }
        }while( !(num >= 0 && num<=10));
        
        System.out.println("El numero " + num + " esta entre 0 y 10.");
    }
}
