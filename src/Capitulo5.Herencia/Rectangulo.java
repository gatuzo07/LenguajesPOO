package Capitulo5.Herencia;

/**
 *
 * @author gatuzo07
 */
public class Rectangulo {
    float ladoMenor;
    float ladoMayor;

    public Rectangulo() {
    }

    public Rectangulo(float ladoMenor, float ladoMayor) {
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }
    
    public float calculararea(){
        return ladoMayor*ladoMenor;
    }

    public float getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public float getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(float ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
            
}
