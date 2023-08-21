package Ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Julio
 */
public class Figuras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la altura del triangulo: ");
        int altura = entrada.nextInt();
        /*
            Dibujo del triangulo: Depende de la altura que ingreseamos. 
            *****
            *****
            *****
            *****
            *****
         */
        System.out.println("=============================");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        /*
            Dibujo del triangulo: Depende de la altura que ingreseamos. 
            *
            **
            ***
            ****
            *****
         */
        System.out.println("=============================");
        for (int i = altura; i > 0; i--) {
            for (int j = i; j <= altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
            Dibujo del triangulo: Depende de la altura que ingreseamos. 
                *
               **
              ***
             ****
            *****
         */
        System.out.println("=============================");
        for (int i = altura; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) { //El motivo por el cual esta i-1, es porque me ayuda a eliminar un espacio al final del ciclo. 
                System.out.print(" ");
            }
            for (int j = i; j <= altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
            Dibujo del triangulo:
                *
               ***
              *****
             *******
            *********
         */
        System.out.println("=============================");
        int k = 0;
        int n = 0;
        for (int i = 0; i < altura; i++) {
            for (int j = i; j < altura - 1; j++) {
                System.out.print(" ");
            }

            while (k <= i + n) {
                System.out.print("*");
                k++;
            }
            k = 0;
            n++;
            System.out.println("");
        }

        /*   
            *
           ***
          *****
           ***
            *
         */
        System.out.println("=============================");
        if (altura % 2 == 1) { // aseguramos que el numero sea impar para imprimir el rombo
            int medio = (altura / 2) + 1; // Buscamos la mitad de la altura, esto para imprimir la primera mitad.
            //Basicamentes es el mismo codigo de arriba solo que aqui utilizo el for. 
            n = 0;
            for (int i = 0; i < medio; i++) {
                for (int j = i; j < medio - 1; j++) {
                    System.out.print(" "); //imprime los espacios en blanco de forma descendente
                }
                for (int j = 0; j <= i + n; j++) {
                    System.out.print("*");
                }
                n++;
                System.out.println("");
            }
            /*
            Aqui debemos hacer algo parecido, solo debemos hacer que el triangulo se imprima al reves. 
             */

            n = altura - 2;  //dado que vamos a imprimir el triangulo al reves para formar el rombo, debemos ir de mayor a menor numero de asteriscos
            // es por eso que utilizamos esta variable
            for (int i = 0; i < medio - 1; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" "); //imprime los espacios en blanco de forma ascendente
                }
                for (int j = n; j > i; j--) { //con la ayuda de la variable "i" vamos a ir reduciendo el numero de asteriscos.                   
                    System.out.print("*");
                }
                n--;
                System.out.println("");
            }
        }

    }
}
