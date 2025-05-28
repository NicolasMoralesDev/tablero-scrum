package com.nicolasmorales.repository;

import com.nicolasmorales.entity.Columna;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ColumnaRepository implements PanacheRepository<Columna> {
}
