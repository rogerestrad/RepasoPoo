package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa9 {
    public void Programa9(){
        Scanner sc=new Scanner(System.in);
        System.out.println("este programa despliega los numeros del 1 al 500");
        System.out.println("presiona enter para comenzar.");
        int x= sc.nextInt();
        for(int i = 1; i <=500; i =i++)
            System.out.println(i);
    }
}
