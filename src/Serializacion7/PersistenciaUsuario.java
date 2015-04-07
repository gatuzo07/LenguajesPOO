package Serializacion7;
import java.io.*;
/**
 *
 * @author gatuzo07
 */
public class PersistenciaUsuario {
    
    public void guardar(Usuario u)throws Exception{
        
        //Paso 1
        File file = new File ("/Users/gatuzo07/archivaldo.txt");
        
        //Paso 2
        FileOutputStream fos = new FileOutputStream(file);
        
        //Paso 3
        //Llenarlo con algo ej. usuario
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
        
    }
    public Usuario leer()throws Exception{
        
        //Paso 1
        File file = new File ("/Users/gatuzo07/archivaldo.yo");
        
        //Paso 2
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Usuario u = new Usuario();
        u = (Usuario)ois.readObject();
        
        return u;
    }
}
