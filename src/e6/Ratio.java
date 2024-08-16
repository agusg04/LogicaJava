package e6;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Ratio {

    /*
     * Crea un programa que se encargue de calcular el aspect ratio de una
     * imagen a partir de una url.
     * - Url de ejemplo:
     *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
     * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
     *   imagen de 1920*1080px.
     */

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        String urlPasada = /*"https://i.pinimg.com/originals/8e/51/30/8e51302d51089d0f234dc16314c4e5b6.jpg";*/  scanner.nextLine();

        Desktop.getDesktop().browse(new URI(urlPasada));

        URL url = new URI(urlPasada).toURL();

        BufferedImage image = ImageIO.read(url);

        int ancho = image.getWidth();
        System.out.println("Ancho: " + ancho);

        int alto = image.getHeight();
        System.out.println("Alto: " + alto);

        BigInteger n1 = new BigInteger(String.valueOf(ancho));
        BigInteger n2 = new BigInteger(String.valueOf(alto));

        BigInteger mcd = n1.gcd(n2);
        System.out.println("MCD: " + mcd);

        int numerador = ancho / mcd.intValue();
        int denominador = alto / mcd.intValue();

        System.out.println("Aspect ratio: " + numerador + ":" + denominador);
        
    }
}
