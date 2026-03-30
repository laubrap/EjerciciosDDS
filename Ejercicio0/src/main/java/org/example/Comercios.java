package org.example;

public class Comercios extends Plan {
    double adicionalPorDispositivo;

    public Comercios(double tarifaBase,double adicionalPorDispositivo){
        super(tarifaBase);
        this.adicionalPorDispositivo = adicionalPorDispositivo;
    }

    @Override
    public double montoPorPlan(int cantidadDispositivos) {
        return tarifaBase + cantidadDispositivos*adicionalPorDispositivo;
    }
}
