/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.MOVES.AtaqueRapido;
import main.MOVES.Latigo;
import main.MOVES.Movimiento;

/**
 *
 * @Artemio Abdiel Tenorio Sanchez
 */
public class Bullbasaur extends Pokemon {
    
    public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
        xp = 64; 
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
        
    }
    
    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }    
    
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Si el pokemon está agotado no podrá realizar nada.
        if (this.hp <= 0) {
            System.out.println("Bullbasaur esta agotado y no puede realizar mas movimientos.");
            return;
        }        
        
        //Obtener el movimiento de acuerdo a su numero ordinal
	Bullbasaur.Movimientos movimientoAUtilizar 
                = Bullbasaur.Movimientos.values()[ordinalMovimiento];        
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
            
        }
        
        //instanciaMovimiento.utilizar(this, oponente);
        instanciaMovimiento.utilizar(this, oponente);
    }    
    
}

