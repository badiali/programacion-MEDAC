package ejerciciosclase;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

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
        System.out.println("");
        // Comentar/descomentar las siguientes líneas para ver los arrays
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        // Ordenamos el array para su búsqueda binaria
        ordenBurbuja(array);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(array));
        
        System.out.println("-------------------------------");

        System.out.println("");
        // Pregunto por el número a buscar
        System.out.println("Escribe un número del 1 al 10:");
        // Guardo el número en variable
        elemento = sn_teclado.nextInt();
        System.out.println("");
        
        // Si la búsqueda devuelve true
        if (busquedaBinaria(array, elemento)) {
            System.out.printf("\033[32m✔ \033[30mEl número %d ha sido encontrado en el array\n", elemento);
        // En caso contrario
        } else {
            System.out.printf("\033[31m✘ \033[30mEl número %d no ha sido encontrado en el array\n", elemento);
        }
        
    }

    public static void ordenBurbuja(int[] array) {
        
        // Recorro el array
        for (int i = 0; i < array.length; i++) {
            // Para cada elemento del array
            for (int j = 0; j < array.length - 1; j++) {
                
                // Si el número es mayor que el siguiente
                if (array[j] > array[j + 1]) {
                    // Intercambio los números
                    int aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                    
                }
            }
        }
    }

    public static boolean busquedaBinaria(int[] array, int elemento) {
        
        // Declaro variables
        int inicio = 0;
        int fin = array.length - 1;
        int posicion_buscar;
        
        // Mientras inicio sea menor que el tamaño del array - 1
        while (inicio <= fin) {
            // Me situo a la mitad del array
            posicion_buscar = (inicio + fin) / 2;
            // Si el número se encuentra en esta iteración
            if (array[posicion_buscar] == elemento) {
                return true;
            } else {
                // Si el número es mayor 
                if (elemento > array[posicion_buscar]) {
                    // Busco a partir de la mitad del array
                    inicio = posicion_buscar + 1;
                } else {
                    // Busco por debajo de la mitad del array
                    fin = posicion_buscar - 1;
                }
            }
        }
        
        return false;
    }
    
}
