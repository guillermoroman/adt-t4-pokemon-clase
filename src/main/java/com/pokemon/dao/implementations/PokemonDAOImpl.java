package com.pokemon.dao.implementations;

import com.pokemon.dao.interfaces.PokemonDAO;
import com.pokemon.model.Pokemon;
import com.pokemon.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PokemonDAOImpl implements PokemonDAO {
    @Override
    public Pokemon findByName(String name) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<Pokemon> query = session.createQuery("from Pokemon p WHERE p.name = :name", Pokemon.class);
            query.setParameter("name", name);
            return query.uniqueResult();
        }
    }

    @Override
    public Pokemon findById(Long id) {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
             return session.get(Pokemon.class, id);
        }
    }

    @Override
    public List<Pokemon> findAll() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from pokemon", Pokemon.class).list();
        }
    }

    @Override
    public void save(Pokemon pokemon) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.persist(pokemon);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Pokemon pokemon) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.merge(pokemon);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Pokemon pokemon) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.remove(pokemon);
            session.getTransaction().commit();
        }
    }
}
