package megapoly;

import model.Casilla;
import model.Jugador;

/**
 *
 * @author Luis Badiali
 */
public class MegaPoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creo las casillas
        Casilla[] casillas = new Casilla[2];
        casillas[0] = new Casilla("Salida", "Inicial", 0);
        casillas[1] = new Casilla("Calle La Paz", "Propiedad", 50);

        // Muestro las casillas
        System.out.println("Casillas creadas:\n--------------------------------\n");
        for (int i = 0; i < casillas.length; i++) {
            System.out.println(casillas[i]);
        }

        // Declaro e instancio jugador1
        Jugador jugador1 = new Jugador("Luis");
        // Muestro la información del jugador1
        System.out.println("\nInfo del jugador1: \n--------------------------------\n" + jugador1);
        // Tira el dado y mueve el jugador1
        jugador1.moverJugador();
        System.out.println("\nPosición después de tirar el dado: " + jugador1.getPosicionActual());
        System.out.println("\nPosción actualizada:\n" + jugador1 + "\n");

    }

}
