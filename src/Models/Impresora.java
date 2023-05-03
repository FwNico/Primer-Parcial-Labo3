package Models;
import Interfaces.iOferta;

public class Impresora extends ProdInformatico implements iOferta {
    private Integer impresionesPorMinuto;

    public Impresora(String nombre, Integer stock, Double precio, String fabricante, Integer impresionesPorMinuto) {
        super(nombre, stock, precio, fabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Impresora() {
    }

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesPorMinuto=" + impresionesPorMinuto
                + super.toString();
    }

    @Override
    public Double descuento(Double porcentaje) {
        Double precio = getPrecio() - ((getPrecio()*porcentaje)/100);
        return precio;
    }
}

