package com.nicolasmorales.repository;

import java.util.List;

public interface IRepoGenerico<T> {

    List<T> obtenerTodos();

    void guardar(T entidad);

}
