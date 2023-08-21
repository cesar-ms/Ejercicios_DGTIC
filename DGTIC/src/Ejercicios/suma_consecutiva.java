package Ejercicios;


import java.util.Scanner;

/**
 * El programa recibe un número entre 1 y 50 y devuelve la suma de los números 
 * consecutivos del 1 hasta el numero ingresado.
 */
/**
 *
 * @author Julio Cesar Morales Sierra
 */
public class suma_consecutiva {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero_entrada;
        int contador = 1;
        int suma_consecutiva = 0;
        System.out.print("Ingrese un numero entre 1 y 50: ");
        numero_entrada = entrada.nextInt();

        if (numero_entrada >= 1 && numero_entrada <= 50) {
            while (contador <= numero_entrada) {
                suma_consecutiva = suma_consecutiva + contador;
                contador++;
            }
            System.out.println("La suma consecutiva es: " + suma_consecutiva);
        } else {
            System.out.println("El numero no se encuentra en el rango establecido");
        }
    }

}
