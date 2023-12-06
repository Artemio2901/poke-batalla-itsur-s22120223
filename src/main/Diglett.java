/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import main.MOVES.Arañazo;
import main.MOVES.Bofeton_lodo;
import main.MOVES.Gruñido;
import main.MOVES.Movimiento;

/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class Diglett extends Pokemon{
   
    public enum Movimientos {
        Bofeton_lodo,
        Arañazo,
        Gruñido
    }
    public Diglett() {
        tipo = "TIERRA";
        hp = 100;
        ataque = 109;
        defensa = 78;
        nivel = 1;
        precision = 4;
     }
     
        //Constructor alterno 1
    public Diglett(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
   @Override
    public Enum[] getMovimientos() {
        return Diglett.Movimientos.values();
    }
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Diglett esta agotado y no puede realizar mas movimientos.");
            return;
        }
        
 Diglett.Movimientos movimientoAUtilizar
                = Diglett.Movimientos.values()[ordinalMovimiento];

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Arañazo:
                instanciaMovimiento = new Arañazo();
                break;
            case Bofeton_lodo:
                instanciaMovimiento = new Bofeton_lodo();
                break;
            case Gruñido:
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



