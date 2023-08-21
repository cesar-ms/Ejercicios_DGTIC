package Ejercicios;


import java.util.Scanner;

/**
 * El programa recibe como entrada un monto en dólares (USD) y 
 * devuelva la cantidad equivalente en pesos mexicanos (MXN)
 */
/**
 *
 * @author Julio
 */
public class Dolar_A_Peso {

    public static void main(String[] args) {
        
        float numero_dolar, conversion;
        float peso_mexicano;

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Ingresa el valor de un dolar en pesos: ");
        peso_mexicano = entrada.nextFloat();
        
        System.out.print("Ingresa el monto total en dolar: ");
        numero_dolar = entrada.nextFloat();

        conversion = numero_dolar * peso_mexicano;

        System.out.println(numero_dolar + " dolares equivalen a " + conversion + " pesos mexicanos");

    }
}
