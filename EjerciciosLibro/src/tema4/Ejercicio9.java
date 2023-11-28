package tema4;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        /**
         * Sentencia Condicional Realiza un programa que resuelva una ecuación
         * de segundo grado (del tipo ax2 +bx+c = 0).
         */
        double a, b, c = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Valor de a:");
        a = s.nextDouble();

        System.out.println("Valor de b:");
        b = s.nextDouble();

        System.out.println("Valor de c:");
        c = s.nextDouble();

        System.out.printf("x1 = %.1f\n", ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a)));
        System.out.printf("x2 = %.1f\n", ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a)));

    }
}
