package com.bedu.example2.service;

import org.springframework.stereotype.Service;
import com.bedu.example2.model.Gato;

@Service
public class GatoService {
    public Gato getGato(String nombre, int edad, String comidaFavorita) {
        Gato gato = new Gato();
        gato.setNombre(nombre);
        gato.setEdad(edad);
        gato.setComidaFavorita(comidaFavorita);
        return gato;
    }
}
