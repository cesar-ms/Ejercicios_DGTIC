package Ejercicios;


import java.util.Scanner;

/**
 * El programa que calcula el perímetro de un triángulo escaleno.
 * El programa pedirá al usuario las tres entradas diferentes para cada lado del triangulo. 
 * 
 */
/**
 *
 * @author Julio Cesar Morales Sieera
 */
public class Perimetro_triangulo_escaleno {

    public static void main(String[] args) {
        
        float longitud_lado1;
        float longitud_lado2;
        float longitud_lado3;
        float perimetro;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado 1");
        longitud_lado1 = entrada.nextFloat();

        System.out.print("Ingresa la longitud del lado 2");
        longitud_lado2 = entrada.nextFloat();

        System.out.print("Ingresa la longitud del lado 3");
        longitud_lado3 = entrada.nextFloat();

        perimetro = longitud_lado1 + longitud_lado2 + longitud_lado3;

        System.out.println("EL perimetro es: " + perimetro);

    }

}
