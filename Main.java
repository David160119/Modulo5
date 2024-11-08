/**
 *Clase Principal
 * @author Ronal
 */

public class Main {
    public static void main(String[] args) {
        Formas circulo = new Circulo(5, "rojo");
        circulo.dibujar();
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());

        Formas cuadrado = new Cuadrado(4, "azul");
        cuadrado.dibujar();
        System.out.println("Area: " + cuadrado.area());
        System.out.println("Perimetro: " + cuadrado.perimetro());

        Formas triangulo = new Triangulo(3, 4, "verde");
        triangulo.dibujar();
        System.out.println("Area: " + triangulo.area());
        System.out.println("Perimetro: " + triangulo.perimetro());

        Formas linea = new Linea(10, "negro");
        linea.dibujar();
        System.out.println("Area: " + linea.area());
        System.out.println("Perimetro: " + linea.perimetro());
    }
}
