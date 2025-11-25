package com.pokemon.dtos.types;

import lombok.Data;

@Data
public class VersionGroupDetailsItem{
    private int levelLearnedAt;
    private VersionGroup versionGroup;
    private MoveLearnMethod moveLearnMethod;
    private Object order;
}