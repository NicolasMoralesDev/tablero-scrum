package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Tablero;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TableroRepository extends RepoGenerico<Tablero>{

    public TableroRepository() { super(Tablero.class); }
}
