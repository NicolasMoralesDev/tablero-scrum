package com.nicolasmorales.repository.impl;

import com.nicolasmorales.entity.Etiqueta;
import com.nicolasmorales.entity.Etiqueta_;
import com.nicolasmorales.repository.IRepoGenerico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

import java.util.List;

/**
 * Repo generico
 * @param <T>
 */
public abstract class RepoGenerico<T> implements IRepoGenerico<T> {

    /**
     * Entity Manager
     */
    @PersistenceContext
    private EntityManager entityManagerFactory;

    private final Class<T> tClass;

    public RepoGenerico(Class<T> tClass) {
        this.tClass = tClass;
    }

    @Override
    @Transactional
    public List<T> obtenerTodos() throws PersistenceException {
        try {
            CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
            CriteriaQuery<T> cr = cb.createQuery(tClass);
            Root<T> root = cr.from(tClass);
            cr.select(root);
            return entityManagerFactory.createQuery(cr).getResultList();
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public void guardar(T entidad) throws PersistenceException {
        try {
            entityManagerFactory.persist(entidad);
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public T obtenerPorId(Long id) throws PersistenceException {
        try {
            CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
            CriteriaQuery<T> cr = cb.createQuery(tClass);
            Root<T> root = cr.from(tClass);
            cr.select(root).where(cb.equal(root.get("id"), id),
                    cb.equal(root.get("borrado"), false));
            return entityManagerFactory.createQuery(cr).getSingleResult();
        } catch (PersistenceException e) {
            throw new PersistenceException(e.getMessage());
        }
    }
}
