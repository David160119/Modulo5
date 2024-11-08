/**
 *Subclase Circulo
 * @author Ronal
 */

public class Circulo extends Formas {
    private final double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Circulo");
    }
}
