package e5;

public class Main {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10, 5);
        Cuadrado cuadrado = new Cuadrado(6);
        Rectangulo rectangulo = new Rectangulo(5, 12);

        calcularAreaPoligono(triangulo);
        calcularAreaPoligono(cuadrado);
        calcularAreaPoligono(rectangulo);

    }

    public static int calcularAreaPoligono(Poligono poligono) {
        int area = poligono.calcularArea();

        poligono.mostrar();
        System.out.println("El area del " + poligono.getClass().getSimpleName() + " es " + area + "\n");

        return area;
    }
}
