package com.geandev.di;
import com.geandev.di.atributo.Coche;
import com.geandev.di.autowired.AreaCalculatorService;
import com.geandev.di.profiles.EnvironmentService;
import com.geandev.di.qualifiers.*;
import com.geandev.di.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
// Uso de primary y qualifiers
//--estaba public class DependencyInjectionApplication {
    //--estaba    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
    //--estaba    public static void main(String[] args) {

        //--estaba      ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        //--estaba    Nido nido = context.getBean(Nido.class);
      //  log.info("Objeto   {} ", avion.getNombre()); aqui utilizamos el perro o pajaro, como avion no tiene NOMBRE no se puede utilizar esto
        //log.info("Animal nombre ={} edad={} ", animal.getNombre(),animal.getEdad());
    //--estaba    nido.imprimir();
//--estaba   }

//--estaba }
//---------------------------------------------------------------------------------------------------------------
//Uso de perfiles qa dev prod
//--estabapublic class DependencyInjectionApplication {
//--estabaprivate static final Logger log = LoggerFactory.getLogger(Pajaro.class);

//--estabapublic static void main(String[] args) {
//--estaba ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
//--estaba EnvironmentService environmentService = context.getBean(EnvironmentService.class);
//--estaba log.info("Actived enviroment: {}", environmentService.getEnvironment());
//--estaba }

//--estaba }
//---------------------------------------------------------------------------------------------
// Uso de scopes
//--estaba public class DependencyInjectionApplication {
    //--estaba   private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    //--estaba   public static void main(String[] args) {
        //--estaba    ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        //--estaba    EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
        //--estaba    EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
        //--estaba   log.info("Are Bean equals {}", ejemploScopeService.equals(ejemploScopeService1));
        //--estaba   log.info("Are Bean == {}", ejemploScopeService == (ejemploScopeService1));
        //--estaba }

    //--estaba}
//--------------------------------------------------------------------------------------------------
public class DependencyInjectionApplication {
    private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
       AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
       log.info("Area total: {}", calculator.calculateArea());
    }

}