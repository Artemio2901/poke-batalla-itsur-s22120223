/*
 * To change this license
 * and open the template in the editor.
 */
package main;
import main.Bullbasaur;
import main.Pikachu;
import main.Charmander;
import main.Snorlax;
import main.Magikarp;
import main.Diglett;

/**
 *
 * @author ARTEM
 */
public class Main {

    public static void main(String[] args) {
      // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        System.out.print("----------------------------------------------");
       
       Snorlax SnorlaxSalvaje = new Snorlax();
       Magikarp MagikarpSalvaje = new Magikarp();
       Diglett DiglettSalvaje = new Diglett();
       
        SnorlaxSalvaje.setNombre("Snorlax");        
        Snorlax Snorlax = SnorlaxSalvaje;
        
        Snorlax.atacar(charmanderSalvaje);
        Snorlax.atacar(charmanderSalvaje, "lengüetazo");
        System.out.print("----------------------------------------------");
       
        MagikarpSalvaje.setNombre("Magikarp ");        
        Magikarp  Magikarp  = MagikarpSalvaje;
        
        Magikarp.atacar(charmanderSalvaje);
        Magikarp.atacar(charmanderSalvaje, "Salpicadura");
        System.out.print("----------------------------------------------");
        
        DiglettSalvaje.setNombre("Diglett");        
        Diglett Diglett = DiglettSalvaje;
        
        Diglett.atacar(charmanderSalvaje);
        Diglett.atacar(charmanderSalvaje, "bofetón lodo");
        System.out.print("----------------------------------------------");
    }
      
       
       
    
      
       
}
