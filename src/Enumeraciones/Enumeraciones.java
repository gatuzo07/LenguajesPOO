package Enumeraciones;

/**
 *
 * @author gatuzo07
 */
public class Enumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MaquinaBuena buena = new MaquinaBuena();
        MaquinaMala mala = new MaquinaMala();
        MaquinaIntermedia intermedio = new MaquinaIntermedia();
        
        buena.setEstado(EstadoDeMaquina.TRABAJANDO);
        mala.setEstado(EstadoDeMaquina.ATASCADO);
        intermedio.setEstado(EstadoDeMaquina.LINEA);
        
        System.out.println("El estado de la maquina es:" +buena.getEstado());
        System.out.println("El estado de la maquina es:" +mala.getEstado());
        System.out.println("El estado de la maquina es:" +intermedio.getEstado());
    }
    
}
