package Serializacion7;
import java.io.*;
/**
 *
 * @author gatuzo07
 */
public class PersistenciaUsuario {
    
    public void guardar()throws Exception{
        
        //Paso 1
        File file = new File ("/Users/gatuzo07/archivaldo.yo");
        
        //Paso 2
        FileOutputStream fos = new FileOutputStream(file);
        
        //Paso 3
        //Llenarlo con algo ej. usuario
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
        
    }
}
