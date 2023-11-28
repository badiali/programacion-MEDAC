package tema2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        /**
         * Tema 2 - Ejercicio 1 Realiza un conversor de pesetas a euros. La
         * cantidad en pesetas que se quiere convertir deberá estar almacenada
         * en una variable.
         */
        double pesetas = 0;
        final double valorEuro = 166.386;

        // Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Inserte la cantidad en pesetas: ");
        pesetas = s.nextDouble();

        System.out.printf("%.2f pts = %.2f €\n", pesetas, (pesetas / valorEuro));

    }

}
