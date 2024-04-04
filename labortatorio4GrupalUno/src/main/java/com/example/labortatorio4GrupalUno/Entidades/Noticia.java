package com.example.labortatorio4GrupalUno.Entidades;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "noticia")
@Entity
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "resumen", length = 500) // Ejemplo de longitud personalizada
    private String resumen;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "contenido_html", columnDefinition = "TEXT") // Tipo de columna específico para contenido HTML
    private String contenidoHtml;

    @Column(name = "publicada")
    private boolean publicada;

    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;

    @Column(name = "id_empresa")
    private Long idEmpresa;
}
