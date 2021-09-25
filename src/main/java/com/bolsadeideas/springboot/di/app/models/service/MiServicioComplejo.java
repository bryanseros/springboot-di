package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("Complejo")
public class MiServicioComplejo implements IServicio{

    public String operacion(){
        return "ejecutando algun proceso importante complejo...";
    }
}
