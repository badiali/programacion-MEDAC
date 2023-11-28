package tema8;

/**
 * Funciones matemáticas de propósito general Paquete "matematicas", una clase
 * "Varias", dos funciones "esPrimo" y "esPar".
 *
 * @author Luis Badiali
 */
public class Matematicas {

    /**
     * Comprueba si un número entero positivo es primo o no. Un número es primo
     * cuando únicamente es divisible entre él mismo y la unidad.
     *
     * @param x un número entero positivo
     * @return <code>true</code> si el número es primo
     * @return <code>false</code> en caso contrario
     */
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba si un número entero positivo es par.
     *
     * @param x un número entero positivo
     * @return <code>true</code> si el número es par
     * @return <code>false</code> en caso contrario
     */
    public static boolean esPar(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

}
