package com.bedu.example4.model;

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
public class Nota {
    private String titulo;
    private String contenido;
    private String autor;
    private String fechaCreacion;
    private String fechaActualizacion;
    private boolean favorita;
}
