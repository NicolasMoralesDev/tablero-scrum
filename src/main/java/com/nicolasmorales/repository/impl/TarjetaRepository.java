package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Tarjeta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

@ApplicationScoped
public class TarjetaRepository extends RepoGenerico<Tarjeta> implements PanacheRepository<Tarjeta> {
    public TarjetaRepository() { super(Tarjeta.class); }

    /**
     * Entity Manager
     */
    @PersistenceContext
    private EntityManager entityManagerFactory;

    public List<Tarjeta> obtenerTarjetasPorColumna(Long columnaId) throws PersistenceException {
        try {
            CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
            CriteriaQuery<Tarjeta> cr = cb.createQuery(Tarjeta.class);
            Root<Tarjeta> root = cr.from(Tarjeta.class);
            //cr.select(root).where(cb.equal(root.get(Tarjeta_.BORRADO), false), cb.equal(root.get(Tarjeta_.), columnaId));

            return entityManagerFactory.createQuery(cr).getResultList();
        } catch (PersistenceException e) {
            throw new PersistenceException("Error");
        }
    }
}
