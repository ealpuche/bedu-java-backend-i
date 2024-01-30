package com.bedu.example2.controller;

import com.bedu.example2.model.Tarea;
import com.bedu.example2.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping("/")
    public Map<Long, Tarea> getTareas() {
        return tareaService.obtenerTareas();
    }

    @PostMapping("/{id}")
    public Tarea crearTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.crearTarea(id, tarea);
    }

    @GetMapping("/{id}")
    public Tarea obtenerTarea(@PathVariable Long id) {
        return tareaService.obtenerTarea(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarea> actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        Tarea tareaActualizada = tareaService.actualizarTarea(id, tarea);
        if (tareaActualizada != null) {
            return ResponseEntity.ok(tareaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tarea> eliminarTarea(@PathVariable Long id) {
       Tarea tareaElimada= tareaService.eliminarTarea(id);
         if(tareaElimada != null){
              return ResponseEntity.ok(tareaElimada);
        }else{
            return ResponseEntity.notFound().build();
        }
    }



}
