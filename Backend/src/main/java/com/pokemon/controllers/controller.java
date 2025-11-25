package com.pokemon.controllers;

import com.pokemon.dtos.SinglePokemonResponse;
import com.pokemon.service.PokemonService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/pokemon")
public class controller {
    public final PokemonService pokemonService;

    public controller(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

    @GetMapping("{name}")
    public  ResponseEntity<SinglePokemonResponse>  getPokemonByName(@PathVariable String name){
        System.out.println(name);
        SinglePokemonResponse response= pokemonService.GetSinglePokemon(name);
        if (response == null) return ResponseEntity.notFound().build();
        return  ResponseEntity.ok(response);
    }
}
