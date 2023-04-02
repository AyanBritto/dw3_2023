/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author C.R.E.E.P.E.R
 */
import java.util.ArrayList;

public class ventas {
    private ArrayList<Producto> producto;

    public ventas() {
        producto = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        producto.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        producto.remove(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : producto) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null; // Si no se encuentra ningún producto con el nombre especificado, se devuelve null
    }

    public ArrayList<Producto> getProductos() {
        return producto;
    }

    
}
