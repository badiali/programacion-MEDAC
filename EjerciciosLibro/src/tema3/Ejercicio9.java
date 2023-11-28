package tema3;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        /**
         * Lectura de datos desde teclado Escribe un programa que calcule el
         * volumen de un cono según la fórmula V = (1/3)πr^2h
         */
        // final double PI = 3.141592654;
        // Se puede usar Math.PI
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura del cono: ");
        double h = sc.nextDouble();

        System.out.println("Introduzca el radio del cono: ");
        double r = sc.nextDouble();

        double v = (1.0 / 3.0) * Math.PI * r * r * h;

        System.out.printf("El volumen del cono es: %.2f cm3\n", v);

    }

}
