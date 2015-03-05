package ETE;

/**
 *
 * @author gatuzo07
 * d) Crea una clase que se llame ValidarEdad que cheque la logica de la 
 *    excepcion anterior
 */
public class ValidarEdad {
    
    public static void validar(int edad) throws EdadNoNegativaException {
            if (edad < 0) throw new EdadNoNegativaException();
    }
}
