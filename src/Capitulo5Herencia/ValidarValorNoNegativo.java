package Capitulo5Herencia;

/**
 *
 * @author gatuzo07
 */
public class ValidarValorNoNegativo {
    
    public static void validar(float valor) throws NumeroNoNegativoException{
        if (valor<0) throw new NumeroNoNegativoException();
    }
}
