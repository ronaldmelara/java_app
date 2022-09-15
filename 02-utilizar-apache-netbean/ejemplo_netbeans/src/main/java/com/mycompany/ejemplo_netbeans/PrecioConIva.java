/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_netbeans;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author melaragalaz
 */
public class PrecioConIva {
    
    /*
    Pide un numero real que represente a un pecio y muestr el precio con IVA. El iva en Chile es el 19%
    */
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        final double IVA = 0.19;
        sc.useLocale(Locale.US);
        System.out.println("Escribe un numero real");
        double precioSinIva = sc.nextDouble();
        
        double precioConIva = precioSinIva * (1 + IVA);
        
        System.out.println("EL precio con iva es " + precioConIva);
    }
}
