package CalculaIMCEncapsulamiento;

/**
 *
 * @author gatuzo07
 */
public class IMCEncapsulamiento {
    /**Reglas del Encapsulamiento
     * 
     * 1. Todos los atributos tienen que llevar 
     * El modificador de acceso private
     */
    private float estatura;
    private float peso;
    
    /**
     * 2. Por cada atributo, debe haber un metodo mutador para asignar o ajustar
     * el valor de los atributos (metodo setter´s)
     * El modificador de acceso siempre es public 
     *  
     */
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(float estatura){
        this.estatura=estatura;
    }
    
    public float calcular(){        
        return peso/(estatura*estatura); 
    }
}
