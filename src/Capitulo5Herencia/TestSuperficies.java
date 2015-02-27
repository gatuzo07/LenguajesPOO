package Capitulo5Herencia;

/**
 *
 * @author gatuzo07
 */

//Clase de aplicación
public class TestSuperficies {

public static void main(String args[]) throws NumeroNoNegativoException{
    
    //Iterar objetos de tipos superficies "s" puede ser cualquier nombre
    for(Superficies s:GenerarSuperficies.ObtenerFiguras()){
        System.out.println(s.caculararea());
    }
}    

}
