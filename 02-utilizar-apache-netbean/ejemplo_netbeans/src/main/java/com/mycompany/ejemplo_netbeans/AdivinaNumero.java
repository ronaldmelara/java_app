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
public class AdivinaNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maximo = 100;
        int minimo = 1;
        int numeroAcertar = (int)(Math.random() * (maximo - minimo +1)+minimo);
        
        int numeroUsuario;
        boolean fin = false;
        
        while (!fin) {
            do {
                System.out.println("Dame un numero entre 1 y 100");
                numeroUsuario = sc.nextInt();
                
                if (!(numeroUsuario >= minimo && numeroUsuario <= maximo)) {
                    System.out.println("Debes escribir un numero entre " + minimo +" y " + maximo);
                }
                
            } while (!(numeroUsuario>= minimo && numeroUsuario <= maximo));
            
            
            if(numeroUsuario < numeroAcertar){
                System.out.println("Es mayor que el que introdujiste");
            }else if (numeroUsuario > numeroAcertar) {
                System.out.println("Es menor que el que introdujiste");
            }else{
                System.out.println("Has acertado!!! El numero era " + numeroAcertar);
                fin = true;
            }
            
            
        }
    }
}
