package com.company.interfaces;

import com.company.Coche;
import com.company.CocheHibrido;
import com.company.interfaces.ICocheService;

public class CocheServiceSportImp implements ICocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Se ha creado un Coche Sport");

        return new CocheHibrido();
    }
}
