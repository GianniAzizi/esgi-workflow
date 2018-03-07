package fr.esgi.config.dbmigrations;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import fr.esgi.domain.Pokemon;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by gianniazizi on 07/03/2018.
 */
@ChangeLog(order = "001")
public class SetupDatabase {

    @ChangeSet(order = "01", id="insertPokemon-01", author="initiator")
    public void addPokemons(MongoTemplate mongoTemplate) {
        Pokemon pokemon = new Pokemon();
        pokemon.setIndex(1);
        pokemon.setName("JeSaisPlus");
        mongoTemplate.save(pokemon);
    }
}
