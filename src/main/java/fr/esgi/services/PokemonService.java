package fr.esgi.services;

import fr.esgi.domain.Pokemon;
import fr.esgi.domain.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gianniazizi on 06/03/2018.
 */
@Service
public class PokemonService {
    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> findAll() {
        return this.pokemonRepository.findAll();
    }
}
