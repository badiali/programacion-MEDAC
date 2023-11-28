package tema8;

/**
 * Paso de parámetros por valor y por referencia
 */
public class ValorReferencia {

    public static void main(String[] args) {
        int n = 10;
        int m[] = {8, 33, 200, 150, 11};

        // A pesar de que la variable que se pasa como parámetro se modifica dentro de
        // la función, los cambios no tienen ningún efecto en el programa principal.
        System.out.println(n);
        calcula(n);
        System.out.println(n);

        System.out.println();

        // Cuando se pasa un parámetro por referencia, por el contrario, si se modifica
        // su valor dentro de la función, los cambios se mantienen una vez que la
        // función ha terminado de ejecutarse. Los arrays se pasan siempre por
        // referencia.
        muestraArray(m);
        incrementa(m);
        muestraArray(m);
    }

    public static void calcula(int x) {
        x += 24;
        System.out.println(x);
    }

    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void incrementa(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i]++;
        }
    }
}
