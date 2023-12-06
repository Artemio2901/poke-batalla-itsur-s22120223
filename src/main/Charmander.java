/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import main.MOVES.AtaqueRapido;
import main.MOVES.Gruñido;
import main.MOVES.Movimiento;
/**
 *
 * Artemio Abdiel Tenorio Sanchez
 */
public class Charmander extends Pokemon {

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        ATAQUE_RAPIDO,
        GRUNIDO,
        //Otros movimientos...
    }
    
    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Charmander esta agotado y no puede realizar mas movimientos.");
            return;
        }        
        
        //Obtener el movimiento de acuerdo a su numero ordinal
        Charmander.Movimientos movimientoAUtilizar = 
                Charmander.Movimientos.values()[ordinalMovimiento];
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case GRUNIDO:
                instanciaMovimiento = new Gruñido();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);
        
    }
    
}

