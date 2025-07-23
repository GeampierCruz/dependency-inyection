package com.geandev.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

    private String marca;

    private Integer modelo;

    public Motor(){
    }

    public String getMarca() {
        return marca;
    }

    @Value("xl1")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }
    @Value("1982")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
