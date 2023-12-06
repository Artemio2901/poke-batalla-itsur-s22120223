/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MOVES;

import main.Pokemon;

/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public abstract class Movimiento {
    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generación
        //...        
    }

    //Atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public abstract void utilizar(Pokemon usuario, Pokemon objetivo);
} 
   
