package ejerciciosjava;

import java.util.Scanner;

public class CalcularLetraDNI {

    // Función que devuelve la letra del número que recibe por parámetro
    public static char calcularLetraDni(int numero_dni) {

        // Declaro el array con el índice de letras
        final char[] LETRA = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calculo el resto del número introducido / 23
        int resto = numero_dni % 23;

        // Devuelvo la letra
        return LETRA[resto];

    }

    public static void main(String[] args) {

        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);

        // Título del programa
        System.out.println("Programa para calcular la letra de tu DNI");
        System.out.println("-----------------------------------------");

        // Pido el número de DNI sin letra
        System.out.println(
                "Introduce tu número de DNI sin la letra:");

        // Guardo la entrada por teclado como String
        String numero_dni_string = sn_teclado.next();

        // Uso .length() para saber el número de carácteres
        int numero_digitos = numero_dni_string.length();

        // Mientras la entrada no tenga 8 dígitos se repite el bucle
        while (numero_digitos != 8) {
            System.out.println(
                    "Introduce un número de 8 dígitos:");
            numero_dni_string = sn_teclado.next();
            numero_digitos = numero_dni_string.length();
        }

        // Paso de String a Integer para hacer el cálculo
        int numero_dni = Integer.parseInt(numero_dni_string);

        // Calculo la letra y la almaceno en la variable
        char letra_dni = calcularLetraDni(numero_dni);

        // Muestro el DNI completo
        System.out.println("");
        System.out.println("Tu DNI es: " + numero_dni + letra_dni);

    }
}
