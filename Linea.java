/**
 *Subclase Linea
 * @author Ronal
 */

public class Linea extends Formas {
    private final double longitud;

    public Linea(double longitud, String color) {
        super(color);
        this.longitud = longitud;
    }

    @Override
    public double area() {
        return 0; // El área de una línea es 0
    }

    @Override
    public double perimetro() {
        return longitud; // El perímetro de una línea es su longitud
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de una Linea");
    }
}
