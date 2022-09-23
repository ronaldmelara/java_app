package com.company;

public class CocheMain {
    public static void main(String[] args) {

        /*String coche = "alfa romeo";
        Coche cocheObj = new Coche("girs grafito", "Chevrolet", "Tracker", 4000.0, 4800.0);
        cocheObj.acelerar(60);
        System.out.println(cocheObj);*/

        CocheElectrico cocheElecObj = new CocheElectrico();
        cocheElecObj.acelerar(40);
        cocheElecObj.setMotorElectrico("GE");
        cocheElecObj.color = "blanco";
        cocheElecObj.fabricante = "toyota";
        System.out.println(cocheElecObj);

        CocheElectrico cocheElecObj2 = new CocheElectrico("negro","mazda","ZX",567.0,4500.0,"General Electric");
        cocheElecObj2.acelerar(10);

        System.out.println(cocheElecObj2);
    }
}
