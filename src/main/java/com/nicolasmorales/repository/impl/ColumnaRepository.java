package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Columna;
import com.nicolasmorales.entity.Columna_;
import com.nicolasmorales.repository.IColumnaRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;

@ApplicationScoped
public class ColumnaRepository extends RepoGenerico<Columna> implements IColumnaRepository, PanacheRepository<Columna> {

    @PersistenceContext
    private EntityManager entityManagerFactory;

    public ColumnaRepository() { super(Columna.class); }

    @Override
    public void borrarPorId(Long id) throws PersistenceException {
        try {
            CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
            CriteriaUpdate<Columna> update = cb.createCriteriaUpdate(Columna.class);
            Root<Columna> root = update.from(Columna.class);
            update.set(Columna_.BORRADO, true);
            update.where(cb.greaterThanOrEqualTo(root.get(Columna_.id), id));
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }

}
