package tema3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /**
         * Tema 2 - Ejercicio 1 Realiza un programa que pida dos números y que
         * luego muestre el resultado de su multiplicación.
         */
        int num1, num2 = 0;

        // Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num1 = s.nextInt();

        System.out.println("Introduce otro número: ");
        num2 = s.nextInt();

        System.out.printf("La suma de los dos números es: %d\n", (num1 + num2));

    }

}
