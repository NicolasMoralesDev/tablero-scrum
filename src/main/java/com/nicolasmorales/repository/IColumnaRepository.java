package com.nicolasmorales.repository;

import jakarta.persistence.PersistenceException;

public interface IColumnaRepository {

    void borrarPorId(Long id) throws PersistenceException;

}
