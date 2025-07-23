package com.geandev.di;
import com.geandev.di.atributo.Coche;
import com.geandev.di.qualifiers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        Nido nido = context.getBean(Nido.class);
      //  log.info("Objeto   {} ", avion.getNombre()); aqui utilizamos el perro o pajaro, como avion no tiene NOMBRE no se puede utilizar esto
        //log.info("Animal nombre ={} edad={} ", animal.getNombre(),animal.getEdad());
        nido.imprimir();
    }

}
