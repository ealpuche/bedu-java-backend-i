package com.bedu.example4.controller;

import com.bedu.example4.model.Usuario;
import com.bedu.example4.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bedu.example4.service.UsuarioService;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public Map<Long, Usuario> getUsuario() {
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {
        Usuario Usuario = usuarioService.obtenerUsuario(id);
        if (Usuario != null) {
            return new ResponseEntity<>(Usuario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{id}")
    public ResponseEntity<Usuario> postUsuario(@PathVariable Long id,@RequestBody Usuario Usuario) {
        Usuario UsuarioCreada = usuarioService.crearUsuario(id, Usuario);
        return new ResponseEntity<>(UsuarioCreada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> putUsuario(@PathVariable Long id, @RequestBody Usuario Usuario) {
        Usuario UsuarioActualizada = usuarioService.actualizarUsuario(id, Usuario);
        if (UsuarioActualizada != null) {
            return new ResponseEntity<>(UsuarioActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
