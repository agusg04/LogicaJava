package e3;

public class Fibonacci {

    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void main(String[] args) {

        int n = 50;
        long v1 = 0;
        long v2 = 1;

        System.out.println(v1);
        System.out.println(v2);

        for (int i = 2; i < n; i++) {
            long res = v1 + v2;

            System.out.println(res);

            v1 = v2;
            v2 = res;
        }

    }
}
