/**
 *Superclase
 * @author Ronal
 */

public abstract class Formas {
    protected String color;

    public Formas(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();
    public abstract void dibujar();
}
