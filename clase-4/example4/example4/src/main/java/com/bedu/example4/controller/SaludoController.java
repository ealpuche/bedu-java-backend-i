package com.bedu.example4.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.bedu.example4.model.Saludo;

@RestController
public class SaludoController {

    // La uri del endpoint es http://localhost:8080/saludo
    @GetMapping("/saludo")
    public Saludo saluda(){

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");

        return saludo;
    }
}
