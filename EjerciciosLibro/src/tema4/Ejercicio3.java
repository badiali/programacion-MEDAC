package tema4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /**
         * Sentencia Condicional Escribe un programa en que dado un número del 1
         * a 7 escriba el correspon- diente nombre del día de la semana.
         */
        String dia = "";

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número (1 - 7):");
        int numero = s.nextInt();

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número erróneo, tiene que ser del 1 al 7";
        }

        System.out.println(dia);

    }
}
