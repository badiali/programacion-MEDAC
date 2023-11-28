package ejerciciosclase;

import java.util.Scanner;

public class CalcularSerieFibonacci {

    // Declaro la función que calcula la serie Fibonacci
    // Se le pasa por parámetros el número de términos
    public static void calcularSerieFibonacci(int numero_terminos) {

        // Declaro las variables necesarias
        int[] serie;

        // Reservo espacio para el número de términos en el array
        serie = new int[numero_terminos];

        // Relleno los dos primeros valores del array
        serie[0] = 0;
        serie[1] = 1;

        // Calculo a partir del siguiente sumando los dos anteriores
        for (int i = 2; i < numero_terminos; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        // Muestro por pantalla la serie con los términos indicados
        for (int i = 0; i < numero_terminos; i++) {
            System.out.printf("%d, ", serie[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);

        System.out.println("Calcular terminos de la serie Fibonacci");
        System.out.println("---------------------------------------");
        
        // Pido el número de términos
        System.out.println("Introduce el número de términos a calcular:");

        // Llamo a la función y le paso el número de términos introducidos por teclado
        calcularSerieFibonacci(sn_teclado.nextInt());
    }
}
