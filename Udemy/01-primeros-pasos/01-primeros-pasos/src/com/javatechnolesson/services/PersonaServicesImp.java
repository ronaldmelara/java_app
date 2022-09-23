package com.javatechnolesson.services;

import com.javatechnolesson.model.Persona;

public class PersonaServicesImp implements IPersonaServices{

    @Override
    public void registrar(Persona persona) {

        System.out.println(persona + " registrada");
    }
    
}
