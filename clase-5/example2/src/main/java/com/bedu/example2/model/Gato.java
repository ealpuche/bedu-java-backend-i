package com.bedu.example2.model;

public class Gato {
    private String nombre;
    private int edad;
    private String comidaFavorita;
    private int edadReal;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getComidaFavorita() {
        return comidaFavorita;
    }
    public void setComidaFavorita(String comidaFavorita){
        this.comidaFavorita = comidaFavorita;
    }

    public int getEdadReal() {
        return edad * 7;
    }

    public void setEdadReal(int edadReal) {
        this.edadReal = edadReal;
    }
}
