package ProyectoCarrusel;

/**
 *
 * @author gatuzo07
 * Creación de Pojo
 */
public class Galeria {

    private String Titulo;
    private String Descripcion;
    private String URL;

    public Galeria(String Titulo, String Descripcion, String URL) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }


}
