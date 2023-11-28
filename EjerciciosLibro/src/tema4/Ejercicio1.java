package tema4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /**
         * Sentencia Condicional Escribe un programa que pida por teclado un día
         * de la semana y que diga qué asignatura toca a primera hora ese día.
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un día de la semana: ");
        String dia = s.next();
        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("A primera hora toca: Diseño");
                break;
            case "martes":
                System.out.println("A primera hora toca: Programación");
                break;
            case "miercoles":
                System.out.println("A primera hora toca: Sistemas informáticos");
                break;
            case "jueves":
                System.out.println("A primera hora toca: Base de datos");
                break;
            case "viernes":
                System.out.println("A primera hora toca: Lenguaje de marcas");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es finde, no hay clase!!");
                break;
            default:
                System.out.println("Error en el día introducido");
        }

    }
}
