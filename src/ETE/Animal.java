package ETE;

/**
 *
 * @author gatuzo07
 * a) De la clase Animal encapsula
 */
public class Animal {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
