package com.company;
import java.util.ArrayList;
import java.util.List;
public class ListaMain {
    public static void main(String[] args) {
        List<String>  nombres = new ArrayList<String>();
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        for (String n : nombres) {
            System.out.println(n);
        }


    }
}
