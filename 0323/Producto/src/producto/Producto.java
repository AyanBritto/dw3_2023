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


    /**
     * @param args the command line arguments
     */
public class Producto implements Comparable<Producto> {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    // Constructor que acepta todos los atributos
    public Producto(String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    @Override
    public int compareTo(Producto otroProducto) {
        if (this.precio < otroProducto.getPrecio()) {
            return -1;
        } else if (this.precio > otroProducto.getPrecio()) {
            return 1;
        } else {
            return 0;
        }
    }

    void remove(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
    Producto p1 = new Producto("Laptop", "Laptop Lenovo con procesador Intel Core i5, 8 GB de RAM y disco duro de 1 TB", 15000.0, 10);
Producto p2 = new Producto("Smartphone", "Smartphone Samsung Galaxy S21 con pantalla OLED de 6.2 pulgadas y cámara de 64 MP", 10000.0, 20);

ventas v = new ventas();
v.agregarProducto(p1);
v.agregarProducto(p2);
    }
}


