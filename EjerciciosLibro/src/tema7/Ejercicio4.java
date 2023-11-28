package tema7;

/*
 * Arrays
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres "numero, cuadrado" y "cubo".
 * Carga el array "numero" con valores aleatorios entre 0 y 100. En el array "cuadrado" se deben 
 * almacenar los cuadrados de los valores que hay en el array "numero". En el array "cubo" se 
 * deben almacenar los cubos de los valores que hay en "numero". A continuación, muestra el 
 * contenido de los tres arrays dispuesto en tres columnas.
 * 
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        // Definir tres arrays de 20 números enteros
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Definir variables
        int i;

        for (i = 0; i < 20; i++) {
            // Carga el array "numero" con valores aleatorios entre 0 y 100
            numero[i] = (int) (Math.random() * 100);
            // Almacenar en el array "cuadrado" los cuadrados de los valores que hay en el array "numero"
            cuadrado[i] = numero[i] * numero[i];
            // Almacenar en el array "cubo" los cubos de los valores que hay en el array "numero"
            cubo[i] = cuadrado[i] * numero[i];
        }

        // for (i = 0; i < 20; i++) {
        // 	// Muestro array "numero"
        // 	System.out.println("Contenido del array 'numero'");
        // 	System.out.printf("numero[%-2d] = %d\n", i, numero[i]);
        // 	// Muestro array "cuadrado"
        // 	System.out.println("Contenido del array 'cuadrado'");
        // 	System.out.printf("cuadrado[%-2d] = %d\n", i, cuadrado[i]);
        // 	// Muestro array "cubo"
        // 	System.out.println("Contenido del array 'cubo'");
        // 	System.out.printf("cubo[%-2d] = %d\n", i, cubo[i]);
        // }
        // Muestro tabla con el contenido de los arrays
        System.out.println("\nA continuación se muestran en tres columnas, un número aleatorio entre 0 y 100, su cuadrado y su cubo:\n");

        System.out.println("n    │ n2    │ n3\n─────┼───────┼─────────");
        for (i = 0; i < 20; i++) {
            System.out.printf("%-4d | %-5d | %-8d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
