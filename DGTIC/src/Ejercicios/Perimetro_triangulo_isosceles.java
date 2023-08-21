package Ejercicios;


import java.util.Scanner;

/*
 *El programa calcula el perímetro de un triángulo isósceles.
    El programa pedirá al usuario las entradas necesarias.
 */

/**
 *
 * @author Julio Cesar Morales Sierra
 */
public class Perimetro_triangulo_isosceles {
    public static void main(String[] args) {
        
         float longitud_lado;
         float longitud_base;
         float perimetro;
         
         Scanner entrada = new Scanner(System.in);
         
         System.out.print("Ingresa la longitud de la base: ");
         longitud_base = entrada.nextFloat();
         
         System.out.print("Ingresa la longitud de uno de los lados faltantes:");
         longitud_lado = entrada.nextFloat();
         
         perimetro = longitud_base + longitud_lado*2;
         
         System.out.println("EL perimetro es: "+ perimetro);
        
    }
}

