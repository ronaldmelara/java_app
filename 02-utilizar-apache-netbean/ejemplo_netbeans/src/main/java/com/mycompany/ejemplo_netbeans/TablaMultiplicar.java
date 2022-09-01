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
public class TablaMultiplicar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");
        
        System.out.println("Inserta un numero");
        int num = sc.nextInt();
        
        int rest = 0;
        for (int i = 1; i <= 10; i++) {
            rest = i*num;
            System.out.println( i +"*"+ num + "=" + rest);
        }
    }
}
