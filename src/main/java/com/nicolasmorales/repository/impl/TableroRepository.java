package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Tablero;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TableroRepository extends RepoGenerico<Tablero> implements PanacheRepository<Tablero> {

    public TableroRepository() { super(Tablero.class); }
}
