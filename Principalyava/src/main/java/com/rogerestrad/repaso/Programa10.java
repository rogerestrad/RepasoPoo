package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa10 {
    public void Programa10(){
        System.out.println("ingresa un numero para determinar su factorial");
        Scanner sc = new Scanner(System.in);
        int dato=sc.nextInt();
        for(int i = 1; i <dato; i =i++)
            dato=dato+i;
    }
}
