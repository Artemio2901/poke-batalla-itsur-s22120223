/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
import java.io.Serializable;
import java.util.List;

public abstract class Pokemon implements Serializable {

   //Atributos
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected String tipo;
    protected int xp;

    public Pokemon() {
    }
    
     public int getNivel() {
        return nivel;
    }
     
     public int getHp(){
         return hp;
     }
     
    public int getAtaque() {
        return ataque;
    } 
    
    public int getDefensa(){
        return defensa;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos 
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
        if(this.hp<=0){
            System.out.println(this.getClass().getSimpleName() + "YA NO PUEDE CONTINUAR");
        }
    }        
    
    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);
    
    public abstract Enum[] getMovimientos();
    
    @Override
    public String toString(){
        if(hp<0){
            return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + "0" + "]";
        }else{
            return this.getClass().getSimpleName() + "[tipo:" + tipo + " hp:" + hp + "]";
        }
    }
    

}
  