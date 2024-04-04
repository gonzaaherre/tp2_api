package com.example.labortatorio4GrupalUno.controller;

import com.example.labortatorio4GrupalUno.Entidades.Noticia;
import com.example.labortatorio4GrupalUno.Services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @PostMapping("/crear")
    public ResponseEntity<Noticia> crearNoticia(@RequestBody Noticia noticia) {
        Noticia nuevaNoticia = noticiaService.saveNoticia(noticia);
        return new ResponseEntity<>(nuevaNoticia, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Noticia> obtenerNoticiaPorId(@PathVariable("id") Long id) {
        Optional<Noticia> noticia = noticiaService.findNoticiaById(id);
        return noticia.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Noticia>> listarNoticias() {
        List<Noticia> noticias = noticiaService.findAllNoticias();
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarNoticiaPorId(@PathVariable("id") Long id) {
        noticiaService.deleteNoticiaById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

