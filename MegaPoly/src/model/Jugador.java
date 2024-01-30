package model;

/**
 * Clase para el Jugador
 *
 * @author Luis Badiali
 */
public class Jugador {

    // Atributos
    private String nombre;
    private double saldo;
    private int posicionActual;
    private Dado dado;

    /**
     * Constructor por defecto
     */
    public Jugador() {
    }

    /**
     * Constructor por parámetros
     *
     * @param nombre
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.saldo = 100;
        this.posicionActual = 0;
        this.dado = new Dado();
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPosicionActual() {
        return posicionActual;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", saldo=" + saldo + ", posicion actual=" + posicionActual + '}';
    }

    /**
     * Método personalizado para mover al jugador
     *
     * @return Un número del 1 al 6
     */
    public void moverJugador() {
        // Tira el dado
        int resultado = dado.tirarDado();
        // Mueve al jugador
        int nuevaPosicion = this.posicionActual + resultado;
        this.posicionActual = nuevaPosicion;
    }

}
