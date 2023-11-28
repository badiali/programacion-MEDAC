package tema7;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int fila, columna;

        // int[][] n = new int[3][2];
        // n[0][0] = 20;
        // n[1][0] = 67;
        // n[1][1] = 33;
        // n[2][1] = 7;
        // Forma abreviada
        int[][] n = {{20, 0}, {67, 33}, {0, 7}};

        for (fila = 0; fila < 3; fila++) {
            System.out.println("Fila: " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
            }
            System.out.println();
        }

    }
}
