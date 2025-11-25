package com.pokemon.dtos.types;

import lombok.Data;

@Data
public class Sprites{
    private Object backShinyFemale;
    private Object backFemale;
    private Other other;
    private String backDefault;
    private Object frontShinyFemale;
    private String frontDefault;
    private Versions versions;
    private Object frontFemale;
    private String backShiny;
    private String frontShiny;
}