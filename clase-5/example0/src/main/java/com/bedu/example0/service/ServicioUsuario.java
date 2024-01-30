package com.bedu.example0.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;


    public void guardarUsuario(Usuario usuario){
        repositorioUsuario.guardar(usuario);
    }
    
}
