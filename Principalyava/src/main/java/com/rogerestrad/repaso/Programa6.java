package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa6 {
    public void Programa6(){
        System.out.println("ingresa un numero y detrminaremos si es par o impar:");
        Scanner sc = new Scanner(System.in);
        int dato=sc.nextInt();
        //int x = dato/2;
        if ((dato/2)==0){
            System.out.println("el numero "+dato+" es par ");
        }else{
            System.out.println("el numero "+dato+"es impar ");
        }

    }
}
