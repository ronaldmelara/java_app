package com.javatechnolesson;

import com.javatechnolesson.model.Persona;
import com.javatechnolesson.services.IPersonaServices;
import com.javatechnolesson.services.PersonaServicesImp;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona pers1 = new Persona(1, "Pepe");
        IPersonaServices personaSrv = new PersonaServicesImp();
        personaSrv.registrar(pers1);
    }
}
