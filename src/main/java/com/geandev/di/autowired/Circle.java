package com.geandev.di.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure{

    @Value("${circle.radius}")
    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
