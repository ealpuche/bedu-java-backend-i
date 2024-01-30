package com.bedu.example2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bedu.example2.service.GatoService;
import com.bedu.example2.model.Gato;

@RestController
@RequestMapping("/api/gato")
public class GatoController {
    @Autowired
    private GatoService gatoService;

    @GetMapping
    public Gato getGato(String nombre, int edad, String comidaFavorita) {
        return gatoService.getGato(nombre, edad, comidaFavorita);
    }

}
