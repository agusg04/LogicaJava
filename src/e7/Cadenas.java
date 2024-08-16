package e7;

public class Cadenas {

    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        //StringBuilder stringBuilder = new StringBuilder(cadena);
        //System.out.println(stringBuilder.reverse());

        for (int i = cadena.length() - 1; i > - 1; i--) {
            System.out.print(cadena.charAt(i));
        }

    }
}
