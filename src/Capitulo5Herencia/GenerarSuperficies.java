package Capitulo5Herencia;
import java.util.*;  //Importar todas las clases del paquete Capitulo5Herencia
/**
 *
 * @author gatuzo07
 */
public class GenerarSuperficies {
    
    public static ArrayList<Superficies> ObtenerFiguras() throws NumeroNoNegativoException{
        ArrayList<Superficies> Figuritas=new ArrayList<Superficies>();
        
        //Primero creamos cuadrados
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        //Crear 1 rectangulos
        Rectangulo r1=new Rectangulo(11,3);
        
        //Crear 2 triangulos
        Triangulo t1=new Triangulo(14,5);
        Triangulo t2=new Triangulo(10,5);
        
        //Crear 2 circulos
        Circulo c1=new Circulo(30);
        Circulo c2=new Circulo(21);
        
        //Agregar al ArrayList
        Figuritas.add(cu1);
        Figuritas.add(cu2);
        Figuritas.add(cu3);
        Figuritas.add(r1);
        Figuritas.add(t1);
        Figuritas.add(t2);
        Figuritas.add(c1);
        Figuritas.add(c2);
        
        return Figuritas;
    }
}
