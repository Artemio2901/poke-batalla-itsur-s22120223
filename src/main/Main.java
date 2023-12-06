package main;


import Batallas.Batalla;
import FileManager.FileManager;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import main.batalla.Entrenador;
import main.Magikarp;
import main.Bullbasaur;
import main.Charmander;
import main.Pikachu;
import main.Diglett;
import main.Snorlax;
import main.Psyduck;
/**
 *
 * Artemio Abdiel Tenorio Sanchez
 */
public class Main {


    public static void main(String[] args) {
Batalla b = FileManager.leerPartida();
        if(b==null){
        System.out.println("Hello PokeBatalla!");
         Magikarp pesencio = new Magikarp("pesencio");
         Diglett totopo = new Diglett("totopo");
         Snorlax gibi = new Snorlax("GIBI");
         Charmander Holaa = new Charmander ("huu");
         Pikachu Pika = new Pikachu ("pika");
         Bullbasaur Bull= new Bullbasaur("BUll");
          
       Entrenador entrenador1 = new Entrenador("gordo");
       entrenador1.capturarPokemon(gibi);
       entrenador1.capturarPokemon(totopo);
       
       Entrenador entrenador2 = new Entrenador("caballo");
       entrenador2.capturarPokemon(Pika);
       entrenador2.capturarPokemon(pesencio);
       
      
  
       b = new Batalla(entrenador1, entrenador2);
        }
        b.desarrollarBatalla();
       
    }
          
        
       
    }
     

