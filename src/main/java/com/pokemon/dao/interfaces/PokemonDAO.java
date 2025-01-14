package com.pokemon.dao.interfaces;

import com.pokemon.model.Pokemon;

public interface PokemonDAO extends BaseDAO<Pokemon>{
    Pokemon findByName (String name);
}
