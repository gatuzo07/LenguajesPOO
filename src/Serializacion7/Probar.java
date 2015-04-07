package Serializacion7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gatuzo07
 */
public class Probar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos un usuario
        Usuario u = new Usuario();
        u.setEmail("rapido@gmail.com");
        u.setNombre("Ricardo Mendoza");
        u.setSueldo(50000);
        
        //Lo guardamos
        PersistenciaUsuario pu = new PersistenciaUsuario();
        try {
            pu.guardar(u);
            System.out.println("Usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
