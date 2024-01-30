package com.bedu.example4.controller;

import com.bedu.example4.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bedu.example4.service.NotaService;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/notas")
public class NotaController {
    @Autowired
    private NotaService notaService;
q
    @GetMapping("/")
    public Map<Long, Nota> getNotas() {
        return notaService.obtenerNotas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nota> getNota(@PathVariable Long id) {
        Nota nota = notaService.obtenerNota(id);
        if (nota != null) {
            return new ResponseEntity<>(nota, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{id}")
    public ResponseEntity<Nota> crearNota(@PathVariable Long id,@RequestBody Nota nota) {
        Nota notaCreada = notaService.crearNota(id, nota);
        return new ResponseEntity<>(notaCreada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nota> actualizarNota(@PathVariable Long id, @RequestBody Nota nota) {
        Nota notaActualizada = notaService.actualizarNota(id, nota);
        if (notaActualizada != null) {
            return new ResponseEntity<>(notaActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
