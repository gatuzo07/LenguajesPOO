package ProyectoGeometriaCopia;

/**
 *
 * @author gatuzo07
 */
public class NumeroNoNegativoException extends Exception {
    
    public NumeroNoNegativoException() {
        super("No se aceptan valores negativos");
    }
    
}
