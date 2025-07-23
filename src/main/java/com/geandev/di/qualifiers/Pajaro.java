package com.geandev.di.qualifiers;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pajaro extends Animal implements Volador{

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("Pajaro Loco") String nombre, @Value("20") Integer edad) {
        super( nombre,edad);
    }

    @Override
    public void volar() {
        log.info("Soy un Pajaro y estoy volando");
    }
}
