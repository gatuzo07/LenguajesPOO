package ETE;

/**
 *
 * @author gatuzo07
 * c) Crear una excepción que se llame EdadNoNegativaException que muestre
 *    un mensaje que diga "No acepto edades negativas"
 */
public class EdadNoNegativaException extends Exception{
    
    public EdadNoNegativaException (){
        super("No se aceptan edades negativas");
    }
}
