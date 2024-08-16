package e5;

public class Triangulo extends Poligono{
    int altura;
    int base;

    public Triangulo(int altura, int base) {
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
    public void mostrar() {
        for (int i = 0; i < altura; i++) {

            for (int j = altura; j > i ; j--) {
                System.out.print(" ");
            }

            // pintar asteriscos
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    @Override
    int calcularArea() {
        return (base * altura) / 2;
    }

}
