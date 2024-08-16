package e5;

public class Cuadrado extends Poligono{
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    void mostrar() {
        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == lado - 1) {
                pintarFila(lado, "*");
                System.out.println();

            } else {
                System.out.print("*");
                pintarFila(lado - 2, " ");
                System.out.print("*");
                System.out.print("\n");
            }
        }
    }

    void pintarFila(int lado, String simbolo) {
        for (int i = 0; i < lado; i++) {
            System.out.print(simbolo);
        }
        //System.out.println();
    }

    @Override
    int calcularArea() {
        return lado^2;
    }

    public static void main(String[] args) {
        new Cuadrado(5).mostrar();
    }
}
