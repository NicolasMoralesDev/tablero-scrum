package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Etiqueta;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EtiquetaRepository extends RepoGenerico<Etiqueta> {

    public EtiquetaRepository() {
        super(Etiqueta.class);
    }
}
