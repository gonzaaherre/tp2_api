package com.example.labortatorio4GrupalUno.controller;

import com.example.labortatorio4GrupalUno.Entidades.Empresa;
import com.example.labortatorio4GrupalUno.Services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;


    @PostMapping("/crear")
    public ResponseEntity<Empresa> crearEmpresa(@RequestBody Empresa empresa) {
        Empresa nuevaEmpresa = empresaService.saveEmpresa(empresa);
        return new ResponseEntity<>(nuevaEmpresa, HttpStatus.CREATED);
    }
    //empresas por id
    @GetMapping("/{id}")
    public ResponseEntity<Empresa> obtenerEmpresaPorId(@PathVariable("id") Long id) {
        Optional<Empresa> empresa = empresaService.findEmpresaById(id);
        return empresa.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    //trae todas las empresas
    @GetMapping("/listar")
    public ResponseEntity<List<Empresa>> listarEmpresas() {
        List<Empresa> empresas = empresaService.findAllEmpresas();
        return new ResponseEntity<>(empresas, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarEmpresaPorId(@PathVariable("id") Long id) {
        empresaService.deleteEmpresaById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

