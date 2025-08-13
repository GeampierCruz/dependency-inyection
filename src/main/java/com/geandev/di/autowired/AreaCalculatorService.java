package com.geandev.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.geom.Area;
import java.util.List;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<Figure>figures;
    public double calculateArea() {
        double area=0;
        for (Figure figure : figures) {
            area+=figure.calculateArea();

        }
        return area;
    }
}
