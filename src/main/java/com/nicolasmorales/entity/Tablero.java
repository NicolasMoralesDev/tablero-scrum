package com.nicolasmorales.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "TABLEROS")
public class Tablero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany
    private List<Columna> columnas;
    @Column(name = "FECHA_DE_CREACION")
    private LocalDateTime fechaDeCreacion;
    @Column(name = "BORRADO")
    private boolean borrado;
}
