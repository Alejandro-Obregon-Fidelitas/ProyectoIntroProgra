package com.mycompany.proyectoprogra;

public class Marca {
    private String nombre;
    private String pais;
    private int fundacionYear;

    /*public Marca(String nombre, String pais, int fundacionYear) {
        this.nombre = nombre;
        this.pais = pais;
        this.fundacionYear = fundacionYear;
    }*/

    public String getNombreMarca() {
        return nombre;
    }

    public void setNombreMarca(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFundacionYear() {
        return fundacionYear;
    }

    public void setFundacionYear(int fundacionYear) {
        this.fundacionYear = fundacionYear;
    }

}
