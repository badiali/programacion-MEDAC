package tema7;

public class ArrayCreacion {

    public static void main(String[] args) {
        // Creación
        // int[] array1;

        // Reserva de espacio
        // array1 = new int[3];
        // Método abreviado de creación y reserva de espacio
        // int[] array1 = new int[3];
        // Inicialización de valores por índice
        // array1[0] = 4;
        // array1[1] = 10;
        // array1[2] = 20;
        // Creación e inicialización en una sola línea
        int[] array1 = {5, 19, 30, 21};

        System.out.println("Contenido del array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array" + i + ": " + array1[i]);
        }

        System.out.println("");
        System.out.println("Suma 1 a cada elemento:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] += 1;
            System.out.println("array" + i + ": " + array1[i]);
        }
    }
}
