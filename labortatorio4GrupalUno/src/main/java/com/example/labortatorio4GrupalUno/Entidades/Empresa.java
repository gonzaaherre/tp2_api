package com.example.labortatorio4GrupalUno.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Empresa")
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "horario_atencion")
    private String horarioAtencion;

    @Column(name = "quienes_somos", length = 2000) // Ejemplo de longitud personalizada
    private String quienesSomos;

    @Column(name = "latitud")
    private double latitud;

    @Column(name = "longitud")
    private double longitud;

    @Column(name = "domicilio")
    private String domicilio;

    @Column(name = "email")
    private String email;
}
