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
public class Magikarp extends pokemon{
     public Magikarp() {
        tipo = "AGUA";
        hp = 30;
        ataque = 29;
        defensa = 85;
        nivel = 1;
        precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("Salpicadura");
        this.habilidades.add("Combate");
     }
     
        //Constructor alterno 1
    public Magikarp(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public void atacar(pokemon oponente, String habilidad){
        if(habilidad.equals("Salpicadura")){
            System.out.println("Realizando Salpicadura");
        }else if(habilidad.equals("Combate")){
            System.out.println("Realizando Combate");            
        }
        //TODO: otras habilidades...
    }
}
