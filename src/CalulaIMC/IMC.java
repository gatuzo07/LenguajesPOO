package CalulaIMC;

/**
 *
 * @author gatuzo07
 */
public class IMC {
    public float peso;
    public float estatura;
    
    public void IMC () {}
    
    public float calcular(float peso, float estatura){

        float elIMC = peso / (estatura*estatura);
        return elIMC;
    }
}
