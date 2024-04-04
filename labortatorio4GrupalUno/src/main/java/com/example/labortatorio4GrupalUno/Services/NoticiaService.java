package com.example.labortatorio4GrupalUno.Services;

import com.example.labortatorio4GrupalUno.Entidades.Noticia;
import com.example.labortatorio4GrupalUno.repositorios.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public Noticia saveNoticia(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    public Optional<Noticia> findNoticiaById(Long id) {
        return noticiaRepository.findById(id);
    }

    public List<Noticia> findAllNoticias() {
        return noticiaRepository.findAll();
    }

    public void deleteNoticiaById(Long id) {
        noticiaRepository.deleteById(id);
    }
}

