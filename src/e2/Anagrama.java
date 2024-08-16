package e2;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();

        if (p1.length() != p2.length()) {
            System.out.println("Las palabras deben tener el mismo numero de letras");
            System.exit(0);
        }

        char[] a1 = p1.toLowerCase().toCharArray();
        char[] a2 = p2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        //System.out.println(a1);
        Arrays.sort(a2);
        //System.out.println(a1);

        for (int i = 0; i < p1.length(); i++){
            if (a1[i] != a2[i]){
                System.out.println("No son anagramas");
                System.exit(0);
            }
        }
        System.out.println("Son anagramas");





    }
}
