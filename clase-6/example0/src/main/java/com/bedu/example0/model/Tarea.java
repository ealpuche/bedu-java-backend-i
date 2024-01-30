package com.bedu.example0.model;


public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completada;
    private String fecha;

    public Tarea(String nombre, String descripcion, boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
