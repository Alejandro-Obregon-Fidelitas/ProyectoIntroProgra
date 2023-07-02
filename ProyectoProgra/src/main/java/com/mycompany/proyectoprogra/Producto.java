package com.mycompany.proyectoprogra;


public class Producto {
     private String nombre;
    private double precio;
    private int cantidad;
    private String marca;
    private String categoria;
    private String descripcion;

    /*public Producto(String nombre, double precio, String marca, String categoria, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
        this.marca = marca;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }*/

    public String getNombreProducto() {
        return nombre;
    }

    public void setNombreProducto(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarcaProducto() {
        return marca;
    }

    public void setMarcaProducto(String marca) {
        this.marca = marca;
    }

    public String getCategoriaProducto() {
        return categoria;
    }

    public void setCategoriaProducto(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcionProducto() {
        return descripcion;
    }

    public void setDescripcionProducto(String descripcion) {
        this.descripcion = descripcion;
    }
}
