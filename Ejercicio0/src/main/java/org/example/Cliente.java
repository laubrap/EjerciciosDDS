package org.example;

public class Cliente {
    Plan planAsociado;
    String[] dispositivos;

    public double monto(){
       return planAsociado.montoPorPlan(dispositivos.length);
    }
}
