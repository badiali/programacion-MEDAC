package tema7;

import java.util.Scanner;

public class GeneradorBanderas {

    public static void main(String[] args) {
        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        System.out.println("Generador aleatorio de banderas");

        Scanner sn_teclado = new Scanner(System.in);

        System.out.println("¿Cuántas franjas quieres poner en la bandera?");
        int franjas = sn_teclado.nextInt();

        System.out.println("----------------");
        for (int i = 0; i < franjas; i++) {
            System.out.println(color[(int) (Math.random() * 6)]);
            System.out.println("----------------");
        }
    }
}
