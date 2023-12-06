/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.MOVES.Movimiento;
import main.MOVES.Psycorayo;

/**
 *
 * Artemio Abdiel Tenorio Sanchez
 */
public class Psyduck extends Pokemon {

    public enum Movimientos {
        PSICORAYO
    }

    public Enum[] getMovimientos() {
        return Psyduck.Movimientos.values();
    }    
    
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Psyduck esta agotado y no puede realizar mas movimientos.");
            return;
        }        

        //Obtener el movimiento de acuerdo a su numero ordinal
        Psyduck.Movimientos movimientoAUtilizar 
                = Psyduck.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case PSICORAYO:
                instanciaMovimiento = new Psycorayo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar movimiento
        instanciaMovimiento.utilizar(this, oponente);
    }

}
