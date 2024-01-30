package com.bedu.example2.model;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class Tarea implements Serializable {
    private String nombre;
    private String descripcion;
    private boolean completada;
    private String fechaLimite;

}
