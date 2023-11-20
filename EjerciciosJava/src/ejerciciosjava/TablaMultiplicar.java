package ejerciciosjava;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            int producto = numero * i;
            System.out.println(numero + " * " + i + " = " + producto);
        }
        
    }
    
}
