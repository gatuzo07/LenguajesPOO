package Capitulo5.Herencia;

/**
 *
 * @author gatuzo07
 */
public class NumeroNoNegativoException extends Exception {
    
    public NumeroNoNegativoException() {
        super("No se aceptan valores negativos");
    }
    
}
