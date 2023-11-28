package tema2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        /**
         * Tema 2 - Ejercicio 1 Realiza un conversor de euros a pesetas. La
         * cantidad en euros que se quiere convertir deberá estar almacenada en
         * una variable.
         */
        double euros = 0;
        final double valorEuro = 166.386;

        // Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Inserte la cantidad en euros: ");
        euros = s.nextDouble();

        System.out.printf("%.2f € = %.2f pts\n", euros, (euros * valorEuro));

    }

}
