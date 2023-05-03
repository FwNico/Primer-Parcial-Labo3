import Contenedora.Comercio;
import Models.Escritorio;
import Models.Impresora;
import Models.Notebook;
import Models.Silla;

public class Main {
    public static void main(String[] args) {

        Silla silla1 = new Silla("DxRacer", 3, 1500d, true);
        Escritorio escritorio1 = new Escritorio("Landirus", 2, 5000d, 1.20d, 1.80d);
        Impresora impresora1 = new Impresora("Ep201", 4, 3000d, "Epson", 60);
        Notebook notebook1 = new Notebook("AsusG20", 5, 23000d,"Asus", 16);

        Comercio comercio1 = new Comercio();

        comercio1.addProducto(silla1);
        comercio1.addProducto(escritorio1);
        comercio1.addProducto(impresora1);
        comercio1.addProducto(notebook1);

        //PUNTO 3
        System.out.println("LISTADO DE PRODUCTOS:" + "\n");
        System.out.println(comercio1.listaProductos());

        //PUNTO 4
        System.out.println("Precio con descuento de impresora1: $" + impresora1.descuento(10d) + "\n");

        //PUNTO 5
        System.out.println("ACTUALIZAMOS PRECIOS:" + "\n");
        System.out.println(comercio1.actualizarValor(5d,10d,15d,20d));

    }
}