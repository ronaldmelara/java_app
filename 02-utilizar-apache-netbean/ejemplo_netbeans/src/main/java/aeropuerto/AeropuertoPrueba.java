/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class AeropuertoPrueba {
    public static void main(String[] args){
        Aeropuerto a = new Aeropuerto("Arturo Merino", "Chile", "Pudahuel", 1, "Santiago", 1970, 10500);
        
        
//        System.out.println(a.aniosAbierto());
        
        a.AniadirAvion(new Avion("Airbus A320", 200, 600));
        a.AniadirAvion(new Avion("Airbus A321", 180, 600));
        System.out.println(a.getNumeroAviones());
        
        System.out.println(a);
        
        Aeropuerto a2 = new Aeropuerto("Puerto Tepual", "Chile", "Puerto Montt", 120, "Los Lagos", 1990, 1500);
        
        System.out.println(a2.toString());
        System.out.println(a2.aniosAbierto());
        
        if (a.equals(a2)) {
            System.out.println("Son Iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        switch(a.compareTo(a2)){
            case 1 -> System.out.println("a > a2");
            case 0 -> System.out.println("Son iguales");
            case -1 -> System.out.println("a es < a2");
        }
        
        AeropuertoPrivado a3 = new AeropuertoPrivado(30, "Puerto Tobalaba", "Chile", "Avenida Tobalaba ", 3440, "Santiago", 1990, 1500);
        
        System.out.println(a3.toString());
        
        
        
    }
    
}
