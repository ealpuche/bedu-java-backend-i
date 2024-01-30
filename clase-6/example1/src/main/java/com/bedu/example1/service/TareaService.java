package com.bedu.example1.service;

import com.bedu.example1.model.Tarea;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TareaService {
    private final Map<Long, Tarea> tareas = new HashMap<>();

    public Tarea crearTarea(Long id, Tarea tarea) {
        tareas.put(id, tarea);
        return tarea;
    }

    public Tarea obtenerTarea(Long id) {
        return tareas.get(id);
    }

    public Tarea actualizarTarea(Long id, Tarea tarea) {
        tareas.put(id, tarea);
        return tarea;
    }

    public boolean eliminarTarea(Long id) {
        //if exists return true else return false
        return tareas.remove(id) != null;
    }

    public Map<Long, Tarea> obtenerTareas() {
        return tareas;
    }

}
