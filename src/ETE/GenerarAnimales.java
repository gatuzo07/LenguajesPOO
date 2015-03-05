package ETE;
import java.util.*;
/**
 *
 * @author gatuzo07
 * e) Crear una clase donde crees 3 animales en un metodo que se llame
 *    GenerarAnimales que devuelvan un arreglo generando a los animales
 */
public class GenerarAnimales {
    
    public static ArrayList<Animal> generarAnimales(){
        ArrayList <Animal> animales = new ArrayList <Animal> ();
        Animal a1 = new Animal ("leon",2);
        Animal a2 = new Animal ("delfin",6);
        animales.add(a1);
        animales.add(a2);
        
        return animales;
    }
}
