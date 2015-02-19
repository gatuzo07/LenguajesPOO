package ProyectoGeometria;

/**
 *
 * @author gatuzo07
 */
public class Cuadrado {
    
    private float lado;
  
/**
 * Este constructor tiene un argumento de tipo flotante
 * @param lado EL parametro a ingresar es el valor del lado de tu cuadrado
 */
    public Cuadrado(float lado){
        this.lado=lado;
        //Inicializar la variable
    }
   
    public Cuadrado(){
    }
    
   
    float calcularArea(){
        float area=lado*lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
