package fr.esgi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by gianniazizi on 06/03/2018.
 */
@Document(collection = "pokemons")
public class Pokemon {
    @Id
    private String id;
    private Integer index;
    private String name;

    public Pokemon() {}

    public Pokemon(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
