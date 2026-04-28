package com.poketienda.poketienda.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poketienda.poketienda.model.Pokemon;


public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    
    // Solo dejamos los métodos que sirven para BUSCAR
    List<Pokemon> findByPeso(String peso);
    
}
