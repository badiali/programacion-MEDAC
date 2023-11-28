package tema1;

public class Ejercicio6 {

    public static void main(String[] args) {
        /**
         * Tema 1 - Ejercicio 6 Escribe un programa que pinte por pantalla una
         * pirámide rellena a base de asteriscos. La base de la pirámide debe
         * estar formada por 9 asteriscos.
         */
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        // Alineado a la derecha con formato
        System.out.printf("%9s\n", "*    ");
        System.out.printf("%9s\n", "***   ");
        System.out.printf("%9s\n", "*****  ");
        System.out.printf("%9s\n", "******* ");
        System.out.printf("%9s\n", "*********");
    }
}
