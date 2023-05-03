package Models;

public class Escritorio extends Producto{
    private double alto;
    private double ancho;

    public Escritorio(String nombre, Integer stock, Double precio, double alto, double ancho) {
        super(nombre, stock, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Escritorio() {
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho
                + super.toString();
    }
}
