package Models;
import Interfaces.iOferta;

public class Silla extends Producto implements iOferta {
    private boolean ruedas;

    public Silla(String nombre, Integer stock, Double precio, boolean ruedas) {
        super(nombre, stock, precio);
        this.ruedas = ruedas;
    }

    public Silla() {
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas
                + super.toString();
    }

    @Override
    public Double descuento(Double porcentaje) {
        Double precio = getPrecio() - ((getPrecio()*porcentaje)/100);
        return precio;
    }
}

