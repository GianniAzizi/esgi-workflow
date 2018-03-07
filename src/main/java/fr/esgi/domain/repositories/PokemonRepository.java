package fr.esgi.domain.repositories;

import fr.esgi.domain.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gianniazizi on 06/03/2018.
 */
@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, String> {
    @Override
    List<Pokemon> findAll();
}
