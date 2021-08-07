
package com.mycompany.clase4;

import java.util.Scanner;


public class Juego {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double numero=Math.random()*10;
        int num=(int)numero;
        
        int i=0;
        System.out.println("Bienvenido al juego Ingrese un numero");
        int valor;
        
        do{
            System.out.println("Introduzca un valor");
            valor=entrada.nextInt();
            if(valor>num){
            System.out.println("No es correcto, te haz pasado");
        }
            if (valor<num) {
                System.out.println("No es correcto, te haz quedado corto");
            }
            i++;
        } while (valor!=num);
        System.out.println("Excelente, correcto, el numero es; "+numero);
        System.out.println("Haz necesitado "+i+" intentos");
    }
}
