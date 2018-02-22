package com.rogerestrad.repaso;

import java.util.Scanner;

/**
 * Created by Edgar Rogelio on 22/02/2018.
 */

public class Programa2 {
    Scanner sc= new Scanner(System.in);
    public void Programa2 (){
        float iva,precio;
        System.out.println("calculemos el iva correspondiente mediante el precio");
        System.out.println("cual es el precio de tu articulo");
        precio=sc.nextFloat();
        iva=(precio/100*16);
        System.out.println("el iva correspondiente al precio ingresado es: "+iva);
        System.out.println("tu producto con el precio total es de:"+(precio+iva));

    }
}
