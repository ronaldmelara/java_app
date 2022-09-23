package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        ICocheService service  = new CocheServiceClassicImp();
        ICocheService service2 = new CocheServiceSportImp();

        Coche coche1 = service.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();

    }
}
