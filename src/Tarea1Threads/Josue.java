package Tarea1Threads;

/**
 *
 * @author gatuzo07
 */
public class Josue implements Runnable {
    
    @Override
    public void run() {
         while(true){
            try{
            System.out.println("Josue");
            Thread.sleep(3000);
            }catch(Exception e){ }
         }
    }
}
