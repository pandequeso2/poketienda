package com.poketienda.poketienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poketienda.poketienda.model.Pokemon;

import com.poketienda.poketienda.service.PokemonService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> listarPokemon(){
        return pokemonService.getPokemon();
    }
    



}
