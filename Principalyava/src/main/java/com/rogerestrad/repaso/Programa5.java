package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa5 {
    public void Programa6(){
        System.out.println("ingresa un numero, si es menor que 50 se duplicara si no se triplicara");
        Scanner sc =new Scanner(System.in);
        float dato=sc.nextFloat();
        if (dato<50){
            dato=dato*2;
        }else{
            dato=dato*3;
        }
        System.out.println("el nuevo numero es:"+dato);
    }
}
