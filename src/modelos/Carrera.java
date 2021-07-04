/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author 50578
 */
public class Carrera {
    
     private String nombre;
    private String facultad;

    private ArrayList<String> primerSemestre = new ArrayList<>();

    public Carrera() {
    }

    public Carrera(String nombre, String facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<String> getPrimerSemestre() {
        return primerSemestre;
    }

    public void setPrimerSemestre(ArrayList<String> primerSemestre) {
        this.primerSemestre = primerSemestre;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", primerSemestre=" + primerSemestre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.facultad);
        hash = 59 * hash + Objects.hashCode(this.primerSemestre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrera other = (Carrera) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.facultad, other.facultad)) {
            return false;
        }
        if (!Objects.equals(this.primerSemestre, other.primerSemestre)) {
            return false;
        }
        return true;
    }

    
}
