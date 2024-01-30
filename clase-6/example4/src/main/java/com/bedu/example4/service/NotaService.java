package com.bedu.example4.service;

import com.bedu.example4.model.Nota;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NotaService {
    Map <Long, Nota> notas = new HashMap<>();
    public Nota obtenerNota(Long id) {
        return notas.get(id);
    }

    public Nota crearNota(Long id, Nota nota) {
        notas.put(id, nota);
        return nota;
    }

    public Nota actualizarNota(Long id, Nota nota) {
        if (notas.containsKey(id)) {
            notas.put(id, nota);
            return nota;
        } else {
            return null;
        }
    }

    public Nota eliminarNota(Long id) {
        if (notas.containsKey(id)) {
            return notas.remove(id);
        } else {
            return null;
        }
    }

    public Map<Long, Nota> obtenerNotas() {
        return notas;
    }


}
