package ejerciciosjava;

import java.util.Scanner;
import java.util.Arrays;

public class BusquedaLineal {

    public static void main(String[] args) {

        // Declaro variables
        int[] array = new int[10];
        int elemento = 0;
        
        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);

        // Relleno array con números random
        for (int i = 0; i < array.length; i++) {
            // Genero un número random 1-10
            array[i] = (int) (Math.random() * 10 + 1);            
        }
        
        System.out.println("Encuentra un número en el array");
        // Comentar/descomentar la siguiente línea para ver el array
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------");

        System.out.println("");
        // Pregunto por el número a buscar
        System.out.println("Escribe un número del 1 al 10:");
        // Guardo el número en variable
        elemento = sn_teclado.nextInt();
        System.out.println("");
        
        // Si la búsqueda devuelve true
        if (busquedaLineal(array, elemento)) {
            System.out.printf("\033[32m✔ \033[30mEl número %d ha sido encontrado en el array\n", elemento);
        // En caso contrario
        } else {
            System.out.printf("\033[31m✘ \033[30mEl número %d no ha sido encontrado en el array\n", elemento);
        }
        
    }

    // Función que busca un número y devuelve true/false
    public static boolean busquedaLineal(int[] array, int elemento) {
        
        // Recorro el array
        for (int i = 0; i < array.length; i++) {
            // Si el número pasado está en el array
            if (array[i] == elemento) {
                return true;
            }
        }
        
        return false;
    }
    
}
