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
public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double calcularCostoDeEnvio(double distancia) {
        double costoBase = 50.0; // Costo base de envío
        double costoPorKm = 5.0; // Costo por kilómetro
        return costoBase + (distancia * costoPorKm);
    }
}
