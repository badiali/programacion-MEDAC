package model;

/**
 * Clase para el Dado
 *
 * @author Luis Badiali
 */
public class Dado {

    /**
     * Tirar el dado
     *
     * @return Un número del 1 al 6
     */
    public int tirarDado() {
        return (int) (Math.random() * 6) + 1;
    }

}
