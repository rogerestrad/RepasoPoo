package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa8 {
    public void Programa8(){
        System.out.println("ingresa tu nombre");
        Scanner sc = new Scanner(System.in);
        String nombre =sc.next();
        System.out.println("cuantas veces quieres repetir tu nombre");
        int x= sc .nextInt();
        for(int i = 0; i <=x; i =i++)
            System.out.println(nombre);
        System.out.println("tu nombre se repitio "+x+" veces ");


    }
}
