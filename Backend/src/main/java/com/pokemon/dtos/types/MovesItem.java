package com.pokemon.dtos.types;

import java.util.List;
import lombok.Data;

@Data
public class MovesItem{
    private List<VersionGroupDetailsItem> versionGroupDetails;
    private Move move;
}