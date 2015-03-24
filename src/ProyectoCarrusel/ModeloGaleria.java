package ProyectoCarrusel;

import java.util.*;

/**
 *
 * @author gatuzo07
 */
public class ModeloGaleria {

    public static ArrayList<Galeria> generarGaleria() {
        
        ArrayList<Galeria> arreglo = new ArrayList<Galeria>();
        
        Galeria g1 = new Galeria("Titulo 1", "Mi descripción 1", "/ProyectoCarrusel/uno.jpg");
        Galeria g2 = new Galeria("Titulo 2", "Mi descripción 2", "/ProyectoCarrusel/dos.jpg");
        Galeria g3 = new Galeria("Titulo 3", "Mi descripción 3", "/ProyectoCarrusel/tres.jpg");
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        
        return arreglo;
    }
}
