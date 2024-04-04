package com.example.labortatorio4GrupalUno.Services;

import com.example.labortatorio4GrupalUno.Entidades.Empresa;
import com.example.labortatorio4GrupalUno.repositorios.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Optional<Empresa> findEmpresaById(Long id) {
        return empresaRepository.findById(id);
    }

    public List<Empresa> findAllEmpresas() {
        return empresaRepository.findAll();
    }

    public void deleteEmpresaById(Long id) {
        empresaRepository.deleteById(id);
    }
}

