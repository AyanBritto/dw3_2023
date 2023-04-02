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


import java.util.ArrayList;

public class RegistroEstudiantes {
    private final ArrayList<Estudiante> estudiante;

    public RegistroEstudiantes() {
        estudiante = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiante.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiante.remove(estudiante);
    }

    public Estudiante buscarEstudiantePorNombre(String nombre) {
        for (Estudiante estudiante : estudiante) {
            if (estudiante.getNombre().equals(nombre)) {
                return estudiante;
            }
        }
        return null; // Si no se encuentra ningún estudiante con el nombre especificado, se devuelve null
    }
}
