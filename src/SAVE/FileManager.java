/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;

import Batallas.Batalla;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Artemio Abdiel Tenorio Sanchez
 */
public class FileManager {
     
    
    public static final String partida = "partida.save";

    public static void escribirPartida(Batalla x) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(partida))) {
            escritorDeObjetos.writeObject(x);
        } catch (IOException ex) {
        }
    }

    public static Batalla leerPartida() {
        Batalla leer = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(partida))) {
            leer = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
        }
        return leer;
    }
    
    public static void borrarPartida() {
    File archivo = new File(partida);
    if (archivo.exists()) {
        archivo.delete();
        System.out.println("Partida anterior eliminada.");
    }
}
}