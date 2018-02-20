package com.rogerestrad.principalyava;
import com.rogerestrad.clases.Carro;
import com.rogerestrad.clases.motocicleta;

public class Principal {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        System.out.println("este es un programa de prueba");
        Carro cnuevo = new Carro("lambo");
        cnuevo.setcolor("Blanco ");
        cnuevo.setModelo(2005);
        cnuevo.datosVehiculo();
        Carro usado= new Carro("tsuru");
        usado.setModelo(1980);
        usado.setcolor("tinto ");
        Carro.color= "verde ";
        System.out.println("");
        usado.datosVehiculo();
        System.out.println();
        cnuevo.datosVehiculo();
        System.out.println("---------------------------------------------");
        motocicleta moto =new motocicleta("tool");
        moto.setModelo(3000);
        moto.datosVehiculo();
        System.out.println("---------------------------------------------");
        motocicleta moto2 =new motocicleta();
        moto2.setModelo(4000);
        moto.setCasco(true);
        moto.setGasolina(300);
        moto.datosVehiculo();
        imprimeautos(cnuevo,usado,moto,moto2);

    }
    public static void imprimeautos(Carro ...c){
        System.out.println("Imprimiendo");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (Carro carro : c)
            carro.datosVehiculo();
    }
}
