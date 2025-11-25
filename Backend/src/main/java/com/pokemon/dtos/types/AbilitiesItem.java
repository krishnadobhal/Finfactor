package com.pokemon.dtos.types;

import lombok.Data;

@Data
public class AbilitiesItem{
    private boolean isHidden;
    private Object ability;
    private int slot;
}