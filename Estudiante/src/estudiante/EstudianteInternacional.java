/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author C.R.E.E.P.E.R
 */
public class EstudianteInternacional extends Estudiante {
    private String paisDeOrigen;

    // Constructor que acepta todos los atributos
    public EstudianteInternacional(String nombre, String apellido, int edad, double notaPromedio, String paisDeOrigen) {
        super(nombre, apellido, edad, notaPromedio);
        this.paisDeOrigen = paisDeOrigen;
    }

    // Constructor que solo acepta nombre, apellido, edad y país de origen
    public EstudianteInternacional(String nombre, String apellido, int edad, String paisDeOrigen) {
        super(nombre, apellido, edad);
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
}
