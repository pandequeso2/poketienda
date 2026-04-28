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

    // Obtener todos los Pokemon
    public List<Pokemon> getPokemon() {
        return pokemonRepository.findAll();
    }
    
    // Guardar un nuevo Pokemon
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    // Obtener Pokemon por ID
    public Pokemon getPokemonById(int id) {
        return pokemonRepository.findById(id).orElse(null);
    }

    // Actualizar Pokemon existente
    public Pokemon updateUsuario(Pokemon poke) {
        // 1. Buscamos el Pokémon original en la base de datos
        Pokemon pokemonExistente = pokemonRepository.findById(poke.getId()).orElseThrow();

        // 2. Actualizamos los datos DIRECTAMENTE en el objeto original
        pokemonExistente.setNombre(poke.getNombre());
        pokemonExistente.setPeso(poke.getPeso());
        pokemonExistente.setTipo(poke.getTipo());
 
        // 3. Le pedimos al repositorio que guarde el objeto modificado
        return pokemonRepository.save(pokemonExistente);
    }
}