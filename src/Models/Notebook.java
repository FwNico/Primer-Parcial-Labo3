package Models;

public class Notebook extends ProdInformatico{
    private Integer memoria;

    public Notebook(String nombre, Integer stock, Double precio, String fabricante, Integer memoria) {
        super(nombre, stock, precio, fabricante);
        this.memoria = memoria;
    }

    public Notebook() {
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria + "gb"
                + super.toString();
    }
}

