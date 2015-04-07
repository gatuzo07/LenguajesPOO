package Serializacion7;

import java.io.Serializable;

/**
 *
 * @author gatuzo07
 * NOTA DE VIDA O MUERTE
 * Una vez creado un archivo serializado, no podras modificar
 * la clase que guardaste en ese archivo, a menos que borres 
 * fisicamente el archivo creado
 * 
 * POJO
 * No lleva logica, clases encapsulada, getters & setters
 * 
 * 
 * MODEL
 * Lleva la logica
 * 
 * 
 * 
 */
public class Usuario implements Serializable {
    private String nombre;
    private float sueldo;
    private String email;

    public Usuario(String nombre, float sueldo, String email) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }
    
    public Usuario(){
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
