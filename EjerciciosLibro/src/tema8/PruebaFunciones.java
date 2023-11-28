package tema8;

import tema8.Matematicas;
import java.util.Scanner;

public class PruebaFunciones {

    public static void main(String[] args) {
        Scanner sn_teclado = new Scanner(System.in);

        System.out.println("¿Será un número par o impar?");
        System.out.println("Introduce un número:");
        int n1 = sn_teclado.nextInt();
        if (tema8.Matematicas.esPar(n1)) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println("¿Será número primo?");
        System.out.println("Introduce un número:");
        int n2 = sn_teclado.nextInt();
        if (tema8.Matematicas.esPrimo(n2)) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }

    }
}
