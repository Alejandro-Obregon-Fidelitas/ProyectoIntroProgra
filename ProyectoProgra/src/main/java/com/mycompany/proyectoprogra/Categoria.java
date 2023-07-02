package com.mycompany.proyectoprogra;

public class Categoria {
    private String nombre;
    private String descripcion;
    private String tipo;

    /*public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }*/

    public String getNombreCategoria() {
        return nombre;
    }

    public void setNombreCategoria(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCategoria() {
        return descripcion;
    }

    public void setDescripcionCategoria(String descripcion) {
        this.descripcion = descripcion;
    }
}
