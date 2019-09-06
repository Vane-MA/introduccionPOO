/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivosSerializablesVanessayCelio;

import java.io.Serializable;

/**
 *
 * @author ITSLOJA
 */
public class Curso implements Serializable{
    private String carrera;
    private String nomCarrera;
    private int numCiclo;
    private int numEstudiantes;

    public Curso() {
    }

    public Curso(String carrera, String nomCarrera, int numCiclo, int numEstudiantes) {
        this.carrera = carrera;
        this.nomCarrera = nomCarrera;
        this.numCiclo = numCiclo;
        this.numEstudiantes = numEstudiantes;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public int getNumCiclo() {
        return numCiclo;
    }

    public void setNumCiclo(int numCiclo) {
        this.numCiclo = numCiclo;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }
    
}
