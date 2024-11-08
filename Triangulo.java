/**
 *Subclase Triangulo
 * @author Ronal
 */

public class Triangulo extends Formas {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        
        return 3 * base;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Triangulo");
    }
}
