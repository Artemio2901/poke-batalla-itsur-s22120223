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
public class Diglett extends pokemon{
    public Diglett() {
        tipo = "TIERRA";
        hp = 45;
        ataque = 109;
        defensa = 78;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("Arañazo");
        this.habilidades.add("bofetón lodo");
     }
     
        //Constructor alterno 1
    public Diglett(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public void atacar(pokemon oponente, String habilidad){
        if(habilidad.equals("Arañazo")){
            System.out.println("Realizando Arañazo");
        }else if(habilidad.equals("bofetón lodo")){
            System.out.println("Realizando bofetón lodo");            
        }
        //TODO: otras habilidades...
    }
    
}
