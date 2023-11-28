package tema4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /**
         * Sentencia Condicional Realiza un programa que pida una hora por
         * teclado y que muestre luego buenos días, buenas tardes o buenas
         * noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20
         * y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
         * minutos no se deben introducir por teclado.
         *
         */
        String saludo = "";

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una hora (0 - 23):");
        int hora = s.nextInt();

        if ((hora >= 6) && (hora <= 12)) {
            saludo = "Buenos días!";
        } else if ((hora >= 13) && (hora <= 20)) {
            saludo = "Buenas tardes!";
        } else {
            if ((hora < 0) || (hora > 23)) {
                saludo = "Error! Introduce una hora de 0 a 23";
            } else {
                saludo = "Buenas noches!";
            }
        }

        System.out.println(saludo);

    }
}
