package tema4;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        /**
         * Sentencia Condicional Realiza un programa que resuelva una ecuación
         * de primer grado (del tipo ax+b= 0).
         */
        double a, b = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Valor de a:");
        a = s.nextDouble();

        System.out.println("Valor de b:");
        b = s.nextDouble();

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.printf("x = %.1f\n", (-b / a));
        }
    }
}
