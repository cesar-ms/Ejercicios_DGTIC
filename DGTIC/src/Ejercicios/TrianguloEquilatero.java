package Ejercicios;


import java.util.Scanner;

/**
 * El programa calcula el perímetro de un triángulo equilátero. 
 * El programa pedirá al usuario una entrada para calcular el perimetro, por que este tipo 
 * de triangulo todos sus lados son iguales. 
 */

/**
 *
 * @author Julio Cesar
 */
public class TrianguloEquilatero {
    public static void main(String[] args) {
        
         float longitud_lado;
         float perimetro;
         
         Scanner entrada = new Scanner(System.in);
         System.out.print("Ingresa la longitud de un lado del triángulo equilátero: ");
         longitud_lado = entrada.nextFloat();
         
         perimetro = longitud_lado*3;
         
         System.out.println("EL perimetro es: "+perimetro);
         
    }
    
}
