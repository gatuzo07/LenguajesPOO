package Capitulo5.Herencia;

/**
 *
 * @author gatuzo07
 */
public class Circulo {
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
}
