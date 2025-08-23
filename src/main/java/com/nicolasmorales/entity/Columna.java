package com.nicolasmorales.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "COLUMNAS")
public class Columna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Tarjeta> tarjetas;
    @ManyToOne
    @JoinColumn(name = "tablero_id", referencedColumnName = "ID")
    private Tablero tablero;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "BORRADO")
    private boolean borrado;

}
