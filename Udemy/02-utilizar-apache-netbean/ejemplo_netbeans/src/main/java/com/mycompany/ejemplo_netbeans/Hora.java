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
public class Hora {
    
    /*
    pide un numero de segundo e indica cuantas horas, minutos y segundo equivalen
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int SEG_HOR = 3600;
        
        System.out.println("escribe el numero de segundos:");
        int segundos = sc.nextInt();
        
        int horas = segundos / SEG_HOR;
        
        int seg_restantes = segundos % SEG_HOR;
        
        int minutos = seg_restantes / 60;
        
        segundos = seg_restantes % 60;
        
        System.out.println("Son " + horas + " hr(s) " +  minutos + " min(s) " + segundos + "seg(s)");
    }
}
