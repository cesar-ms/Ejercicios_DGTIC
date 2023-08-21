package Ejercicios;

/**
 * El programa obtiene los pares que existen entre 0 y 100. 
 */

/**
 *
 * @author Julio Cesar Morales Sierra
 */
public class numeroPar {

    public static void main(String[] args) {
        int numero = 0;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println("Numero par: " + numero);
            }
            numero++;
        }
    }
}
