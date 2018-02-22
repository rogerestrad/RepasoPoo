package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa4 {
    public void Programa4(){
        System.out.println("ingresa la hora que deseas convertir.");
        Scanner sc =new Scanner(System.in);
        int ingreso= sc.nextInt();


        if (ingreso<13||ingreso>=1){
            System.out.println("la hora ingresada es:"+ingreso+" convertida es:"+ingreso);
        }
        if (ingreso>=13||ingreso<25){
            System.out.println("la hora ingresada es:"+ingreso+" convertida es:"+(ingreso-12));
        }
        if(ingreso>24){
            System.out.println("la hora especificada no existe.");
        }
        else{System.out.println("la hora ingresada es:"+ingreso+" convertida es:12");}
    }
}
