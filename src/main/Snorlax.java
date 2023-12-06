/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import main.MOVES.Amnesia;
import main.MOVES.Golpe_cabeza;
import main.MOVES.Hiperrayo;
import main.MOVES.Movimiento;



/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Snorlax extends Pokemon{

    public enum Movimientos {
        Golpe_cabeza,Amnesia,
        Hiperrayo
    }
     public Snorlax() {
        tipo = "NORMAL";
        hp = 100;
        ataque = 190;
        defensa = 169;
        nivel = 1;
        precision = 3;      
     }
     
        //Constructor alterno 1
    public Snorlax(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Snorlax.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Snorlax esta agotado y no puede realizar mas movimientos.");
            return;
        }
        
        //Obtener el movimiento de acuerdo a su numero ordinal
        Snorlax.Movimientos movimientoAUtilizar
                = Snorlax.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Golpe_cabeza:
                instanciaMovimiento = new Golpe_cabeza();
                break;
            case Hiperrayo:
                instanciaMovimiento = new Hiperrayo();
                break;
            case Amnesia:
                instanciaMovimiento = new Amnesia();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }

}
    

