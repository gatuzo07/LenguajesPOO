package Capitulo5Herencia;

/**
 *
 * @author gatuzo07
 */
public class ProbarConstructores {

    public static void main(String[] args) throws NumeroNoNegativoException{
        float f=45;
        double d2=45.2; 
        int i2=300;
        
        Cuadrado c=new Cuadrado((float)d2);
    }
}
       /*
        float f=45;
        float f2=(float)45.2;
        
        
        double dedos=45.2;
        int i2=300;
        
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        i=s;
        b=(byte)l;
        l=i;
        s=(short)i;
        b=(byte)s;
        s=(short)l;
        l=s;
        b=(byte)i;
        b=(byte)s;
        i=b;
        
    }
*/