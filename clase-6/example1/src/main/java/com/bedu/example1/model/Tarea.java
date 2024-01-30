package com.bedu.example1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completada;
    private String fechaLimite;
}
