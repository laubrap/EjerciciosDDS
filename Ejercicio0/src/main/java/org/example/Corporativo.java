package org.example;

public class Corporativo extends Plan {
    private double porcentajeDeDescuento;

    public Corporativo(double tarifaBase,double adicionalPorDispositivo){
        super(tarifaBase);
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    @Override
    public double montoPorPlan(int cantidadDispositivos) {
        return tarifaBase*(1-porcentajeDeDescuento);
    }
}