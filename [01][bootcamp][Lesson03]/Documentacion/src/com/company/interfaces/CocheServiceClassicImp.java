package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.ICocheService;

public class CocheServiceClassicImp implements ICocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Se ha creado  un Coche Clasico");
        return new CocheElectrico();
    }
}
