package com.example.labortatorio4GrupalUno.repositorios;

import com.example.labortatorio4GrupalUno.Entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
    // Aquí puedes agregar métodos adicionales si necesitas realizar consultas personalizadas
}

