package com.bedu.example2.model;

public class Perro {
    private String nombre;
    private int edad;
    private String comidaFavorita;

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
}
