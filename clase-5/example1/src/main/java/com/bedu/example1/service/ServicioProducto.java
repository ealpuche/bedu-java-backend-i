package com.bedu.example1.service;

import org.springframework.stereotype.Service;

import com.bedu.example1.model.Producto;

@Service
public class ServicioProducto {
    public Producto obtenerProducto(int id) {
        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre("Producto " + id);
        producto.setDescripcion("Descripción del producto " + id);
        producto.setPrecio(100 + id);
        return producto;
    }

    public void guardarProducto(Producto producto) {
        System.out.println("Guardando producto: " + producto.getNombre());
    }
}
