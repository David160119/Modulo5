/**
 *Subclase Cuadrado
 * @author Ronal
 */

public class Cuadrado extends Formas {
    private final double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Cuadrado");
    }
}
