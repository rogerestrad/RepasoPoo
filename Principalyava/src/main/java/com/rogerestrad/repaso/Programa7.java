package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa7 {
    public void Programa7(){
        System.out.println("ingresa un numero del 1 al 7 y te lo mostrare en numeros romanos");
        Scanner sc = new Scanner(System.in);
        int dato=sc.nextInt();
        System.out.println("su numero romano es:");
        switch (dato) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
        }
    }
}
