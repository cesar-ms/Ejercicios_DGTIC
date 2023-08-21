package Ejercicios;


import java.util.Scanner;

/*
 *  EL programa resulve el problema de los números arábigos y números romanos. 
 */
/**
 *
 * @author Julio Cesar Morales Sierra
 * 
 * 
 * FUNCIONAMIENTO DEL PROGRAMA:
 * 
 * Se tiene un par formado por “AR”: 
 * 
 * Donde: 
 * “A” es un número en sistema decimal(positivo y entero)
 * “R” es un número romano
 * 
 * La entrada del programa es una cadena formada por dos pares “AR“, sus valores se calculan de la siguiente manera:
 * 
 * Se suman los valores de los pares si el "R" del primer par, es mayor o igual al "R" del segundo par.
 * 
 * 3C4X = (3*100) + (4*10)
 * 3C4X = 300 + 40
 * 3C4X = 340
 * 
 * Se restan los pares si el "R" del primer par es menor al del segundo par.
 * 
 * 4X3C = -(4 * 10) - (3 * 100)
 * 4X3C = -40 + 300 
 * 4X3C = 260
 *
 */
public class numeros_Arabigo_Y_Romano {

    //Declaramos un arreglo con los numero romanos que se utilizaran para el problema.
    static String romanos[][] = {{"I", "1"},
                                {"V", "5"},
                                {"X", "10"},
                                {"L", "50"},
                                {"C", "100"},
                                {"D", "500"},
                                {"M", "1000"}};

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa cadeana AR:");
        String cadena = entrada.nextLine();
        System.out.println("El rultado es: " + operacion(cadena));
        
    }
    /**
     * El metodo se encarga de determinar si la cadena ingresada es correcta.
     * Se basa en la estructura propuesta del problema. 
     * @param cadena
     * @return 
     */

    public static boolean esCorrecta(String cadena) {
        //se comprobara si la cadena cumple con la estructura AR
        if (cadena.length() != 4) {
            System.out.println("Cadena incorrecta, debe contener 2 pares AR");
            return false;
        }else if(cadena.length()==4){
            if(Character.getNumericValue(cadena.charAt(0))>= 0 && Character.getNumericValue(cadena.charAt(2)) >= 0){
               if(String.valueOf(cadena.charAt(1)).equals(buscarNumeroRomano(String.valueOf(cadena.charAt(1)),'r'))){ 
                    if(String.valueOf(cadena.charAt(3)).equals(buscarNumeroRomano(String.valueOf(cadena.charAt(3)),'r'))){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                   return false;
               }
            }else{
                return false;
            }
            
        }else{
            return false;
        }
        
    }
    /**
     * El metodo busca el numero romano dentro del arreglo estabecido como romanos.
     * @param romano es numero romano que se buscara
     * @param opcion establece el numero de retorno , puede ser decimal o romano.
     * @return 
     */
    public static String buscarNumeroRomano(String romano,char opcion) { 
        int posicion = -1;
        String numeroRomano; 
        for (int i = 0; i < romanos.length; i++) {
            if(romanos[i][0].equals(romano)){
                posicion = i;
                break;
            }
        }
        if(posicion != -1){
            switch (opcion) {
                case 'd':
                    return numeroRomano =  romanos[posicion][1];
                case 'r':
                    return numeroRomano =  romanos[posicion][0];
                default:
                    return "Opcion incorrecta, debe escribir 'd' para obtener numero decimal o 'r' para obtener el numero romano";
            }
        }else{
            return "-1";
        }            
    }
/**
 * El metodo realiza las operaciones de suma y resta según el caso.
 * @param cadena
 * @return 
 */
    public static int operacion(String cadena) {
        if (esCorrecta(cadena) == true) {
            int resultado;
            int romanoPrimerPar = Integer.parseInt(buscarNumeroRomano(String.valueOf(cadena.charAt(1)),'d'));// se obtiene el numero romano de tipo entero romano
            int romanoSegundoPar = Integer.parseInt(buscarNumeroRomano(String.valueOf(cadena.charAt(3)),'d'));//..
            int numeroDecimalPar1 = Integer.parseInt(String.valueOf(cadena.charAt(0)));//se obtine el numero decimal de tipo entero
            int numeroDecimalPar2 = Integer.parseInt(String.valueOf(cadena.charAt(2)));//..
        
            if (romanoPrimerPar >= romanoSegundoPar) {
                 return resultado = ((numeroDecimalPar1*romanoPrimerPar) + (numeroDecimalPar2*romanoSegundoPar));
                 
            }else{
                 return resultado = (-(numeroDecimalPar1*romanoPrimerPar) + (numeroDecimalPar2*romanoSegundoPar));
            }
        }else{
            System.out.println("La cadena es incorrecta");
        }
        return -1;
    }

}
