package Capitulo5Herencia;

/**
 *
 * @author gatuzo07
 */
public class Rectangulo implements Superficies{
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

    @Override
    public float caculararea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
