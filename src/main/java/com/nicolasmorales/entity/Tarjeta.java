package com.nicolasmorales.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "TARJETAS")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITULO")
    private String titulo;
    @OneToMany
    private List<Etiqueta> etiquetas;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_DE_CREACION")
    private LocalDateTime fechaDeCreacion;
    @Column(name = "BORRADO")
    private boolean borrado;
}
