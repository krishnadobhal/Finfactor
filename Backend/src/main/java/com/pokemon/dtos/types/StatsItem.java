package com.pokemon.dtos.types;

import lombok.Data;

@Data
public class StatsItem{
    private Stat stat;
    private int baseStat;
    private int effort;
}