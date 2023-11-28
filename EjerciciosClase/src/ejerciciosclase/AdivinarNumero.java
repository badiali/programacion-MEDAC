package ejerciciosclase;

import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        // Creo una variable para el número de intentos
        int intentos = 3;
        // Variable para guardar el número que se introduce
        int numero_introducido;
        // Booleano si acertado
        boolean acierto = false;

        // Entrada por teclado
        Scanner sn_teclado = new Scanner(System.in);
        
        // Guardo un número random 1-9
        int numero_random = (int) (Math.random() * 9 + 1);

        // Título del juego
        System.out.println("Encuentra el número");
        System.out.println("-------------------");
        
        do {
            
            System.out.println("");
            
            // Muestro intentos restantes
            System.out.println("\033[30mIntentos restantes: \033[31m" + intentos);
            
            // Pido un número por teclado del 1 al 9
            System.out.println("\033[30mIntroduce un número del 1 al 9:\033[32m");
            numero_introducido = sn_teclado.nextInt();

            // Si el número es correcto le paso true de lo contrario muestro mensaje
            if (numero_introducido == numero_random) {
                acierto = true;
            } else {

                // Muestro mensaje
                System.out.println("\033[35m¡Número incorrecto!");
                
                // Doy las pistas si el número es mayor o menor
                if (numero_introducido > numero_random) {
                    System.out.println("\033[36m* Es menor que " + numero_introducido);
                } else if (numero_introducido < numero_random) {
                    System.out.println("\033[36m* Es mayor que " + numero_introducido);
                }
            }

            // Resto un intento
            intentos--;
        } while ((!acierto) && (intentos > 0));

        System.out.println("");
        System.out.println("--------------------------------------------");
        
        // Si acertado es true muestro un mensaje u otro
        if (acierto) {
            System.out.println("\033[32m¡Genial! \033[30mHas acertado el número era el " + numero_random);
        } else {
            System.out.println("\033[35m¡Ohhhh! \033[30mhas agotado todas las oportunidades");
            System.out.println("El número era el " + numero_random);
        }

        System.out.println("");
    }

}
