package fr.esgi.services;

import fr.esgi.domain.Pokemon;
import fr.esgi.domain.repositories.PokemonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by gianniazizi on 07/03/2018.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PokemonServiceTest {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Before
    public void beforeTest() throws Exception {
        pokemonRepository.deleteAll();
        for(int i = 1; i <= 10; i++) {
            Pokemon pokemon = new Pokemon(i,"test");
            pokemonRepository.save(pokemon);
        }
    }

    @Test
    public void findAll() throws Exception {
        List<Pokemon> pokemons = pokemonRepository.findAll();
        assertEquals(10, pokemons.size());
    }

}