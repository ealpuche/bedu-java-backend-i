package com.bedu.example1.controller;

import com.bedu.example1.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bedu.example1.service.ServicioProducto;
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    private ServicioProducto servicioProducto;

    @GetMapping
    public Producto obtenerProducto(int id) {
        return servicioProducto.obtenerProducto(id);
    }


}
