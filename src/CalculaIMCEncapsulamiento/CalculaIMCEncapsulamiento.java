
package CalculaIMCEncapsulamiento;

/**
 *
 * @author gatuzo07
 */
public class CalculaIMCEncapsulamiento {

    public static void main(String[] args) {
        IMCEncapsulamiento xxx = new IMCEncapsulamiento();  
        /**
        * 3. Por cada atributo debe haber un metodo accesorio para obtener el 
        * valor de un atributo, metodo (getter´s)
        * El modificador de accesdo debe ser publico
        */ 
        xxx.setEstatura(1.80f);
        xxx.setPeso(78);
        System.out.println("Tu IMC es: " + xxx.calcular());
    }
    
}
