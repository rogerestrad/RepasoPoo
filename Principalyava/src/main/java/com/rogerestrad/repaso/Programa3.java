package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa3 {
    public void Programa3(){
        System.out.println("calculemos los grados centigrados en fahrenheit y kelvin");
        System.out.println("ingresa los grados centigrados a convertir");
        Scanner sc = new Scanner(System.in);
        int grado,k;
        double f,x=1.8;
        grado=sc.nextInt();
        k=grado+273;
        f=(grado*x)+32;
        System.out.println("la conversion en grados es:");
        System.out.println("Fahrenheit:"+f);
        System.out.println("Kelvin:"+k);
    }
}
