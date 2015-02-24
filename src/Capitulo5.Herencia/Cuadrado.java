package Capitulo5.Herencia;

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
    //Inicializar la variable lado *Examen
    public Cuadrado(float lado)throws NumeroNoNegativoException{
        
        ValidarValorNoNegativo.validar(lado);
        this.lado=lado;
    }
    
    //Constructor defecto
    public Cuadrado(){
    }
    
   
    float calcularArea(){
        float area=lado*lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException {
        ValidarValorNoNegativo.validar(lado);
        this.lado=lado;
    }
}
