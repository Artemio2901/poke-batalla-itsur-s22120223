/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.batalla;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import main.Pokemon;

/**
 *
 * Artemio Abdiel Tenorio Sanchez
 */
public class Entrenador implements Serializable {
    public String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;
    
    public Entrenador(String nombre){
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
        this.pokemonsCapturados = new ArrayList<>();
    }
    
    public boolean capturarPokemon(Pokemon p){
        return pokemonsCapturados.add(p);
    }
    
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento){
        if(pokemonActual == null){
            System.out.println("No has seleccionado ningun pokemon");
            return;
        }
        
        if(ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length){
            System.out.println("movimiento no encontrado");
            return;
        }
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }
    
    public boolean estaDerrotado(){
        for(Pokemon pokemon : pokemonsCapturados){
            if(pokemon.getHp() > 0){
                return false;
            }
        }
        return true;
    }
    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    
    public Pokemon getPokemonActual(){
        return pokemonActual;
    }
    
    public void setPokemonActual(Pokemon p){
        this.pokemonActual = p;
    }
    
    public List<Pokemon> getPokemonsCapturados(){
        return pokemonsCapturados;
    }
}