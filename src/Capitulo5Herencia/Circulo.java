package Capitulo5Herencia;

/**
 *
 * @author gatuzo07
 */
public class Circulo implements Superficies {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calculararea(){
        return 3.1416f*radio*radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float caculararea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
