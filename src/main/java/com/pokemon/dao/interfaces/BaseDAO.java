package com.pokemon.dao.interfaces;

import java.util.List;

public interface BaseDAO<T> {
    T findById (Long id);
    List<T> findAll();
    void save (T entity);
    void update (T entity);
    void delete (T entity);
}
