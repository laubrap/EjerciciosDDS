package org.example;

public class Hogares extends Plan {
    public Hogares(double tarifaBase){
        super(tarifaBase);
    }

    @Override
    public double montoPorPlan(int cantidadDispositivos) {
        return tarifaBase;
    }
}