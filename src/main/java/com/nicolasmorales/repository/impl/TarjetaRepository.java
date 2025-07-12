package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Tarjeta;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TarjetaRepository extends RepoGenerico<Tarjeta> {
    public TarjetaRepository() { super(Tarjeta.class); }
}
