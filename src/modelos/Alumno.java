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
public class Alumno {
    
    private String nombre;
    private String cedula;
    private Carrera nombreCarrera;
    private String sexo;
    
    private ArrayList<Materia> primero = new ArrayList<>();

    private ArrayList<Materia> segundo = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre, String cedula, Carrera nombreCarrera, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nombreCarrera = nombreCarrera;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Carrera getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(Carrera nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Materia> getPrimero() {
        return primero;
    }

    public void setPrimero(ArrayList<Materia> primero) {
        this.primero = primero;
    }

    public ArrayList<Materia> getSegundo() {
        return segundo;
    }

    public void setSegundo(ArrayList<Materia> segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + "\ncedula=" + cedula + "\nnombreCarrera=" + nombreCarrera + "\nsexo=" + sexo + "\nNotas Cuarto Año=" + primero + "\nnotas Quinto Año=" + segundo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.cedula);
        hash = 59 * hash + Objects.hashCode(this.nombreCarrera);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + Objects.hashCode(this.primero);
        hash = 59 * hash + Objects.hashCode(this.segundo);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.nombreCarrera, other.nombreCarrera)) {
            return false;
        }
        if (!Objects.equals(this.primero, other.primero)) {
            return false;
        }
        if (!Objects.equals(this.segundo, other.segundo)) {
            return false;
        }
        return true;
    }

  
    
}
