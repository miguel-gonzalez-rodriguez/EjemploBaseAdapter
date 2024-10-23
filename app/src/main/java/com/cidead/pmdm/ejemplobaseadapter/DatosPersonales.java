package com.cidead.pmdm.ejemplobaseadapter;

/**
 * Clase para almacenar dos cadenas
 */
public class DatosPersonales {
    private String nombre;
    private String apellidos;

    public DatosPersonales(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}

