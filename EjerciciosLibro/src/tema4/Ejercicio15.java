package tema4;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        /*
          * Escribe un programa que pinte una pirámide rellena con un carácter
          * introducido por teclado que podrá ser una letra, un número o un símbolo como
          * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
          * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo,
          * hacia la izquierda o hacia la derecha.
         */
        char c;
        String direccion = "";

        Scanner s = new Scanner(System.in);

        System.out.println("Vamos a pintar una pirámide!");

        System.out.println("Introduce un carácter: ");
        c = s.next().charAt(0);

        System.out.println("¿Hacia donde apunta el vértice de tu pirámide? (arriba, abajo, izquierda o derecha)");
        direccion = s.next();

        switch (direccion) {
            case ("arriba"):
                System.out.println("  " + c);
                System.out.println(" " + c + c + c);
                System.out.println("" + c + c + c + c + c);
                break;
            case ("abajo"):
                System.out.println("" + c + c + c + c + c);
                System.out.println(" " + c + c + c);
                System.out.println("  " + c);
                break;
            case ("izquierda"):
                System.out.println("    " + c);
                System.out.println("  " + c + c + c);
                System.out.println("" + c + c + c + c + c);
                System.out.println("  " + c + c + c);
                System.out.println("    " + c);
                break;
            case ("derecha"):
                System.out.println(c);
                System.out.println("" + c + c + c);
                System.out.println("" + c + c + c + c + c);
                System.out.println("" + c + c + c);
                System.out.println(c);
                break;
        }

    }
}
