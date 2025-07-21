package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Etiqueta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EtiquetaRepository extends RepoGenerico<Etiqueta> implements PanacheRepository<Etiqueta> {

    public EtiquetaRepository() {
        super(Etiqueta.class);
    }
}
