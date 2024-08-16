package e5;

public class Rectangulo extends Poligono{
    int altura;
    int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    void mostrar() {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                pintarFila(base, "*");
                System.out.println();

            } else {
                System.out.print("*");
                pintarFila(base - 2, " ");
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
        return base * altura;
    }

    public static void main(String[] args) {
        new Rectangulo(5, 10).mostrar();
    }

}
