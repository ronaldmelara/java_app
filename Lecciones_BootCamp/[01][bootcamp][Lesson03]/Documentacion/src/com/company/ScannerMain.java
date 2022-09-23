package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be scanned: ");
        String str = scanner.nextLine();
        System.out.println("El val introducido es: " + str);

        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        System.out.println("El val introducido es: " + num);

    }
}
