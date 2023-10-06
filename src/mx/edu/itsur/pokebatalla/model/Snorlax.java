/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author ARTEM
 */
public class Snorlax extends pokemon{
     public Snorlax() {
        tipo = "NORMAL";
        hp = 80;
        ataque = 190;
        defensa = 169;
        nivel = 1;
        precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("lengüetazo");
        this.habilidades.add("Cabezazo zen");
     }
     
        //Constructor alterno 1
    public Snorlax(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(pokemon oponente, String habilidad){
        if(habilidad.equals("Cabezazo zen")){
            System.out.println("Realizando Cabezazo zen");
        }else if(habilidad.equals("lengüetazo")){
            System.out.println("Realizando lengüetazo");            
        }
        //TODO: otras habilidades...
    }
}
