package ejerciciosclase;

import java.util.Scanner;

public class CalcularPotencia {

    public static void main(String[] args) {

        // Definimos las variables
        int base, exponente, resultado = 0;

        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);

        // Título del programa
        System.out.println("Calcular la potencia de un número positivo");
        System.out.println("------------------------------------------");
        System.out.println("");

        // Pedimos la base
        System.out.println("Introduzca la base:");
        base = sn_teclado.nextInt();
        System.out.println("");

        // Pedimos el exponente
        System.out.println("Introduzca el exponente:");
        exponente = sn_teclado.nextInt();

        // Calculamos potencia
        resultado = calcularPotencia(base, exponente);

        // Mostramos resultado
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.printf("La potencia de %d^%d es: %d\n", base, exponente, resultado);
    }

    // Función para calcular la potencia
    public static int calcularPotencia(int base, int exponente) {

        // Le damos el valor de 1 a potencia
        int potencia = 1;

        switch (exponente) {
            // Cualquier número elevado a 1 siempre será el mismo número
            case 1:
                potencia = base;
                break;
            // Cualquier número elevado a cero siempre será 1
            case 0:
                break;
            default:
                // Calculamos la potencia de la base por el exponente
                for (int i = 1; i <= exponente; i++) {
                    potencia *= base;
                }
                break;
        }

        // Devolvemos el resultado
        return potencia;
    }

}
