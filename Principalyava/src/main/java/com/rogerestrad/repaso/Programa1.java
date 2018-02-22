package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa1 {
float base,altura;
public void Programa1(){
        System.out.println("conoscamos el area de un triangulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la altura del triangulo");
        altura= sc.nextFloat();
        System.out.println("ingresa la base del triangulo");
        base=sc.nextFloat();
        base=base*altura/2;
        System.out.println("el area es: "+base);
    }


}
