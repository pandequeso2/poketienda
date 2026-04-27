package com.poketienda.poketienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poketienda.poketienda.model.Pokemon;


public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findByActivoTrue();

    void setNombre(String nombre);

    void setPeso(String peso);

    void setTipo(String tipo);
}
