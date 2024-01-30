package com.bedu.example1.controller;

import com.bedu.example1.model.Tarea;
import com.bedu.example1.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;
    @GetMapping("/")
    public Map<Long, Tarea> getTarea() {
        return tareaService.obtenerTareas();
    }
    @PostMapping("/{id}")
    public Tarea postTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.crearTarea(id, tarea);
    }

    @GetMapping("/{id}")
    public Tarea getTarea(@PathVariable Long id) {
        return tareaService.obtenerTarea(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tarea> deleteTarea(@PathVariable Long id) {
        boolean eliminado = tareaService.eliminarTarea(id);
        if (eliminado) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public Tarea putTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

}
