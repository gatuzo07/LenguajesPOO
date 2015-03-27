package Serializacion;

import java.io.Serializable;

/**
 *
 * @author gatuzo07
 * 
 * Paso1. A las clases a serializar implementarles la interface Serializable
 * 
 * Paso2. Crear la clase compresora (guarda) y descompresora (lee) para las 
 *        clases del paso 1
 * 
 * 
 */
public class Cliente implements Serializable {
    private String nombre;
    private String sueldo;
    private Direccion direccion;

    public Cliente(String nombre, String sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
}
