package tema7;

/*
 * Arrays
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último
 * en mostrarse y viceversa.
 * 
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);
        // Declaración de variables
        int i;
        // Crear array
        int[] numeros = new int[10];
        // Pedir los 10 números
        System.out.println("Introduce 10 números enteros");
        System.out.println("Pulse INTRO por cada número");
        // Rellenar el array con las entradas por teclado
        for (i = 0; i < 10; i++) {
            numeros[i] = sn_teclado.nextInt();
        }
        // Mostrar el contenido del array en orden inverso
        System.out.println("Contenido del array en orden inverso:");
        for (i = 9; i >= 0; i--) {
            System.out.printf("numeros[%d] = %d\n", i, numeros[i]);
        }

    }
}
