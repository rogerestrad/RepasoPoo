package com.rogerestrad.clases;

/**
 * Created by Edgar Rogelio on 20/02/2018.
 */

public class motocicleta extends Carro {
    //Carro c=new carro("asdhalsf")
    boolean casco;

    @Override
    public void datosVehiculo() {
        super.datosVehiculo();
        System.out.println("Casco"+isCasco()+" gasolina: "+getGasolina());
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    int gasolina;
    public motocicleta() {
        super("generica");
    }
    public motocicleta(String nombre) {
        super(nombre);
    }
}

