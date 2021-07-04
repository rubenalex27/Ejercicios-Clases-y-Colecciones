/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Objects;

/**
 *
 * @author 50578
 */
public class Vaso {
    private int tamaño;
    private int precio;
    private String sabor;

    public Vaso() {
    }

    @Override
    public String toString() {
        return "Vaso{" + "tama\u00f1o=" + tamaño + ", precio=" + precio + ", sabor=" + sabor + '}';
    }
    
    

    public Vaso(int tamaño, int precio, String sabor) {
        this.tamaño = tamaño;
        this.precio = precio;
        this.sabor = sabor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.tamaño;
        hash = 41 * hash + this.precio;
        hash = 41 * hash + Objects.hashCode(this.sabor);
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
        final Vaso other = (Vaso) obj;
        if (this.tamaño != other.tamaño) {
            return false;
        }
        if (this.precio != other.precio) {
            return false;
        }
        if (!Objects.equals(this.sabor, other.sabor)) {
            return false;
        }
        return true;
    }
    
}
