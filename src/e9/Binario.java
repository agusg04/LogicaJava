package e9;

public class Binario {

    /*
     * Crea un programa se encargue de transformar un número
     * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
     */

    public static void main(String[] args) {
        int a = 12;
        StringBuilder binario = new StringBuilder();

        while (a != 0) {
            if (a % 2 == 0) {
                binario.insert(0, "0");

            } else if (a % 2 == 1) {
                binario.insert(0, "1");
            }
            a = a / 2;
        }

        System.out.println(a + " en binario es " + binario);

        //String binario = Integer.toBinaryString(a);
        //System.out.println(binario);

    }
}
