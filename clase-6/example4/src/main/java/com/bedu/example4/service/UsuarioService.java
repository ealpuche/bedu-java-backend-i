package com.bedu.example4.service;

import com.bedu.example4.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UsuarioService {
    Map<Long, Usuario> usuarios = new HashMap<>();

    public Usuario obtenerUsuario(Long id) {
        return usuarios.get(id);
    }

    public Usuario crearUsuario(Long id, Usuario usuario) {
        usuarios.put(id, usuario);
        return usuario;
    }

    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        if (usuarios.containsKey(id)) {
            usuarios.put(id, usuario);
            return usuario;
        } else {
            return null;
        }
    }

    public Usuario eliminarUsuario(Long id) {
        if (usuarios.containsKey(id)) {
            return usuarios.remove(id);
        } else {
            return null;
        }
    }

    public Map<Long, Usuario> obtenerUsuarios() {
        return usuarios;
    }
}
