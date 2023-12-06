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
public class MovimientoEspecial extends Movimiento{

    @Override
    public void utilizar(Pokemon usuario, Pokemon objetivo) {
        System.out.println("APLICANDO MOVIMIENTO ESPECIAL");

        //Calcular el daño
        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; //this.getPoder();
        int defensaObjetivo = objetivo.getDefensa();
        
        //Calcular el modificador, considerando tipos.
        double modificador = 1.0; // Modificador base (sin modificaciones)       
        //if ()... POR HACER, TOMAR EN CUENTA CLASE DE MOVIMIENTO Y TIPO DE POKEMON
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        //Imprimir efecto del movimiento en consola
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
        System.out.println("El objetivo quedo asi: " + objetivo);  
    }    
    
}

