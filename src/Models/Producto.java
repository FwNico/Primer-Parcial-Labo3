package Models;

public abstract class Producto {
    private String nombre;
    private Integer stock;
    private Double precio;

    public Producto(String nombre, Integer stock, Double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=$" + precio +
                '}';
    }
}

