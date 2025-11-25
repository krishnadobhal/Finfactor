package com.pokemon.dtos;

import java.util.List;

import com.pokemon.dtos.types.*;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SinglePokemonResponse  {
    private Cries cries;
    private String locationAreaEncounters;
    private List<TypesItem> types;
    private int baseExperience;
    private List<Object> heldItems;
    private int weight;
    private boolean isDefault;
    private List<Object> pastTypes;
    private Sprites sprites;
    private List<PastAbilitiesItem> pastAbilities;
    private List<AbilitiesItem> abilities;
    private List<GameIndicesItem> gameIndices;
    private Species species;
    private List<StatsItem> stats;
    private List<MovesItem> moves;
    private String name;
    private int id;
    private List<FormsItem> forms;
    private int height;
    private int order;
}