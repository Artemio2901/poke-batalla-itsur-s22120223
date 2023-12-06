/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import main.batalla.Entrenador;

/**
 *
 * @author ARTEM
 */
public class filemanager{
     public static final String file_name="main.batalla.avances";
     
    public static void guardar(Entrenador entrenador){
    try{
        FileOutputStream flujosalida=new FileOutputStream(file_name);
        ObjectOutputStream escritorio = new ObjectOutputStream(flujosalida);
        escritorio.writeObject(entrenador);
    }
    catch(FileNotFoundException ex){
        System.out.println("no se pudo joven no hay sistema");
    }
    catch(IOException ex){
        System.out.println("no funca");
    }
    }
    public static Entrenador leerarchivo(){
        return null;
    
    }
    }
