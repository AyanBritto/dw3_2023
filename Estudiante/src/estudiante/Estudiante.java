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
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double notaPromedio;

    // Constructor que acepta todos los atributos
    public Estudiante(String nombre, String apellido, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    // Constructor que solo acepta nombre, apellido y edad
    public Estudiante(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, 0.0); // Llamada al constructor anterior, pasando notaPromedio como 0.0
    }

    // Getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
    public static void main(String[] args) {
    EstudianteInternacional e1 = new EstudianteInternacional("Ayan", "Britto", 20, 8.5, "Paraguay");
EstudianteInternacional e2 = new EstudianteInternacional("Nelson", "Mandela", 21, "USA");
    }

    void remove(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

