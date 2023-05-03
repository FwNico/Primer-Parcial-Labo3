package Models;

public abstract class ProdInformatico extends Producto{
    private String fabricante;

    public ProdInformatico(String nombre, Integer stock, Double precio, String fabricante) {
        super(nombre, stock, precio);
        this.fabricante = fabricante;
    }
    public ProdInformatico() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return ", fabricante='" + fabricante + '\''
                + super.toString();
    }
}

