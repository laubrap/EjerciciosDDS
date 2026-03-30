package org.example;

public abstract class Plan {
    protected double tarifaBase;

    public Plan(double tarifaBase){ //constructor de la clase abstracta
        this.tarifaBase = tarifaBase;
    }

    abstract double montoPorPlan(int cantidadDispositivos);
}

