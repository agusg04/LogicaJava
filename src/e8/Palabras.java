package e8;

import java.util.*;

public class Palabras {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     */

    public static void main(String[] args) {

        String texto = "Hola, mi nombre es agustin. Mi nombre completo es Agustin Sanchez.";

        System.out.println(texto);

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter("[,. ]+");

        List<String> palabras = new ArrayList<>();
        Map<String, Integer> recuento = new HashMap<>();

        while (scanner.hasNext()) {
            palabras.add(scanner.next().toLowerCase());
        }

        Collections.sort(palabras);
        System.out.println(palabras);

        for (String palabra : palabras) {
            if (recuento.containsKey(palabra)) {
                int valor = recuento.get(palabra);
                recuento.put(palabra, valor + 1);

            } else {
                recuento.put(palabra, 1);
            }
        }

        for (Map.Entry<String, Integer> entrada : recuento.entrySet()) {
            System.out.println("Palabra: " + entrada.getKey() + " Recuento: " + entrada.getValue());
        }

    }
}
