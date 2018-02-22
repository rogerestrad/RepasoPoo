package com.rogerestrad.principalyava;
import com.rogerestrad.clases.Carro;
import com.rogerestrad.clases.motocicleta;
import com.rogerestrad.repaso.Programa1;
import com.rogerestrad.repaso.Programa10;
import com.rogerestrad.repaso.Programa2;
import com.rogerestrad.repaso.Programa3;
import com.rogerestrad.repaso.Programa4;
import com.rogerestrad.repaso.Programa5;
import com.rogerestrad.repaso.Programa6;
import com.rogerestrad.repaso.Programa7;
import com.rogerestrad.repaso.Programa8;
import com.rogerestrad.repaso.Programa9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       /** System.out.println("hola mundo");
        System.out.println("este es un programa de prueba");
        Carro cnuevo = new Carro("lambo");
        cnuevo.setcolor("Blanco ");
        cnuevo.setModelo(2005);
        cnuevo.datosVehiculo();
        Carro usado= new Carro("tsuru");
        usado.setModelo(1980);
        usado.setcolor("tinto ");
        Carro.color= "verde ";
        System.out.println("");
        usado.datosVehiculo();
        System.out.println();
        cnuevo.datosVehiculo();
        System.out.println("---------------------------------------------");
        motocicleta moto =new motocicleta("tool");
        moto.setModelo(3000);
        moto.datosVehiculo();
        System.out.println("---------------------------------------------");
        motocicleta moto2 =new motocicleta();
        moto2.setModelo(4000);
        moto.setCasco(true);
        moto.setGasolina(300);
        moto.datosVehiculo();
        imprimeautos(cnuevo,usado,moto,moto2);

    }
    public static void imprimeautos(Carro ...c){
        System.out.println("Imprimiendo");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (Carro carro : c)
            carro.datosVehiculo();
    }**/

        int dato;
        do {
            System.out.println("Este Es Un Pequeno MENU De Programas");
            System.out.println("escoge en cual quieres participar");
            System.out.println("" +
                    "1  Area de un Triangulo\n" +
                    "2  Precio del IVA\n" +
                    "3  Grados Centigrados\n" +
                    "4  Las Horas Cambiadas\n" +
                    "5  Doble o Triple\n" +
                    "6  Par o Impar\n" +
                    "7  Romanos\n" +
                    "8  Y tu Nombre es\n" +
                    "9  Un Quinienton\n" +
                    "10 Factorial\n\n" +
                    "11 salir del menu");
            System.out.println("\nINGRESA EL NUMERO DEL PROGRAMA");
            Scanner sc =new Scanner(System.in);
            dato=sc.nextInt();
            switch (dato){
                case 1:
                    Programa1 p1 = new Programa1() ;
                    p1.Programa1();
                    break;
                case 2:
                    Programa2 p2=new Programa2();
                    p2.Programa2();
                    break;
                case 3:
                    Programa3 p3= new Programa3();
                    p3.Programa3();
                    break;
                case 4:
                    Programa4 p4=new Programa4();
                    p4.Programa4();
                    break;
                case 5:
                    Programa5 p5 = new Programa5();
                    p5.Programa6();
                    break;
                case 6:
                    Programa6 p6=new Programa6();
                    p6.Programa6();
                    break;
                case 7:
                    Programa7 p7=new Programa7();
                    p7.Programa7();
                    break;
                case 8:
                    Programa8 p8=new Programa8();
                    p8.Programa8();
                    break;
                case 9:
                    Programa9 p9=new Programa9();
                    p9.Programa9();
                    break;
                case 10:
                    Programa10 p10=new Programa10();
                    p10.Programa10();
                    break;
                default:

                    break;
            }
            System.out.println("¿deseas regresar al menu de programas?y/n");
            String x=sc.next();
            if (x.equals("n"))
                dato=11;
        }while(dato!=11);
    }
}
