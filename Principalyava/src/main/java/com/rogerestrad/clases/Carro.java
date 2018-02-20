package com.rogerestrad.clases;

/**
 * Created by Edgar Rogelio on 19/02/2018.
 */

public class Carro {
int modelo;
public static String color;
public String nombre;
   public Carro(String nombre){
       this.nombre=
               nombre;
   }
    public void datosVehiculo(){
        int y = 90;
        System.out.println(modelo+" "+color+nombre);
        System.out.println("corre a "+y+" km");
    }
    public void setModelo(int m){
        modelo=m;
    }
    //
    public void setcolor(String color){
        this.color=color;
    }



}
