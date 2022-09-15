/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class PruebaAvion {
    public static void main(String[] args){
        Avion a1 = new Avion();
        Avion a2 = new Avion("boeing 747", 200, 400);
        
        a1.setModelo("modelo 1");
        a1.setnAsientos(100);
        
        System.out.println(a1.getModelo());
        System.out.println(a2.toString());
    }
}
