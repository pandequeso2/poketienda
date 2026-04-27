package com.poketienda.poketienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poketienda.poketienda.model.Pokemon;

import com.poketienda.poketienda.repository.PokemonRepository;



@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    //Obtener todos los Pokemon
    public List<Pokemon> getPokemon() {
        return pokemonRepository.findAll();
    }
    // Guardar un nuevo Pokemon
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    // Obtener usuario por ID
    public Pokemon getPokemonById(int id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    // Actualizar usuario existente
    public Pokemon updateUsuario(Pokemon poke) {
        Pokemon pokemonExistente = pokemonRepository.findById(poke.getId()).orElseThrow();

        pokemonRepository.setNombre(poke.getNombre());
        pokemonRepository.setPeso(poke.getPeso());
        pokemonRepository.setTipo(poke.getTipo());
 
        return pokemonRepository.save(pokemonExistente);
    }

}