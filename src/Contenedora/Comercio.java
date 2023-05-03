package Contenedora;
import Models.*;
import java.util.ArrayList;
import java.util.List;

public class Comercio {

    List<Producto> productos;

    public Comercio(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public String listaProductos(){
        String lista = "";
        if(productos.isEmpty()){
            lista = "No hay productos en la lista";
        }else{
            for (Producto produ:productos){
                if(produ instanceof Silla){
                    lista += "SILLA:  " + produ.toString() + "\n";
                } else if (produ instanceof Escritorio){
                    lista += "ESCRITORIO:  " + produ.toString() + "\n";
                } else if (produ instanceof Impresora){
                    lista += "IMPRESORA:  " + produ.toString() + "\n";
                } else if (produ instanceof Notebook){
                    lista += "NOTEBOOK:  " + produ.toString() + "\n";
                }
            }
        }
        return lista;
    }

    public String actualizarValor(Double sillaPorc, Double escritorioPorc, Double impresoraPorc, Double notebookPorc){
        String comparaValores= "";
        for(Producto produ: productos){

            comparaValores+= produ.toString() + "\n";
            if(produ instanceof Silla){
                comparaValores += "ValorSinAumento:" + produ.getPrecio() + "\n";
                produ.setPrecio(produ.getPrecio() + ((produ.getPrecio()*sillaPorc)/100));
                comparaValores += "Nuevo Valor:" + produ.getPrecio() + "\n";
            } else if (produ instanceof Escritorio){
                comparaValores += "ValorSinAumento:" + produ.getPrecio() + "\n";
                produ.setPrecio(produ.getPrecio() + ((produ.getPrecio()*escritorioPorc)/100));
                comparaValores += "Nuevo Valor:" + produ.getPrecio() + "\n";
            } else if (produ instanceof Impresora){
                comparaValores += "ValorSinAumento:" + produ.getPrecio() + "\n";
                produ.setPrecio(produ.getPrecio() + ((produ.getPrecio()*impresoraPorc)/100));
                comparaValores += "Nuevo Valor:" + produ.getPrecio() + "\n";
            } else if (produ instanceof Notebook){
                comparaValores += "ValorSinAumento:" + produ.getPrecio() + "\n";
                produ.setPrecio(produ.getPrecio() + ((produ.getPrecio()*notebookPorc)/100));
                comparaValores += "Nuevo Valor:" + produ.getPrecio() + "\n";
            }
        }
        return comparaValores;
    }
}
