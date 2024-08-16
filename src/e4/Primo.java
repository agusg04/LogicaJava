package e4;

import java.util.Scanner;

public class Primo {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static boolean esPrimo(int n) {

        if (n < 2) {
            return false;

        } else {

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(esPrimo(n) ? "Es primo" : "No es primo");

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }


}
