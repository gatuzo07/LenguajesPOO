package Capitulo5.Herencia;

/**
 *
 * @author gatuzo07
 */
public class Arreglos {
    
    //metodo
    public void tuNombre(int x[]){
        
    }
    
    //clase
    public static void main (String args[]){
      
        
        //Correctos
        int x[]=new int[3];
        int []y=new int[3];
        //int z[]=(1,-200,45);
        
        //Incorrectos
        //int w=new int[];
        //int j[3]=new int[];
        //int m[4]=new int[4];
        //int []n=(1,4.5,3);
        
        x[0]=127;
        x[1]=200;
        x[2]=23; 
        //Iterar
        
        
        for(int i=0; i<3; i++){
            System.out.println(x[i]);
        }
    System.out.println("si ocurreo la excepcion" + "nunca me veras");
    
        int a=2;
        int b=0;
        System.out.println(a/b);   
        
    }

}
