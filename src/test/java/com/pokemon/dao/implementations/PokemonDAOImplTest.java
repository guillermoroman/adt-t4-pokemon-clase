package com.pokemon.dao.implementations;

import com.pokemon.dao.interfaces.PokemonDAO;
import com.pokemon.model.Pokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PokemonDAOImplTest {

    @Test
    public void testSavePokemon(){
        Pokemon pokemon = new Pokemon();
        pokemon.setAttack(20.0);
        pokemon.setHp(60);
        pokemon.setName("Charmander");
        pokemon.setElement("fire");
        pokemon.setRarity("common");
        pokemon.setEvolvesFrom(null);

        PokemonDAO pokemonDAO = new PokemonDAOImpl();
        pokemonDAO.save(pokemon);

        Pokemon retrieved = pokemonDAO.findByName("Charmander");
        assertNotNull(retrieved);
        assertEquals("fire", retrieved.getElement());

    }
}
