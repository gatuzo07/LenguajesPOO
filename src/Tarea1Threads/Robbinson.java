package Tarea1Threads;

/**
 *
 * @author gatuzo07
 */
public class Robbinson implements Runnable {
    
    @Override
    public void run() {
        try{
            Thread.sleep(6000);
            System.out.println("Robbinson");
        }catch(InterruptedException e){ }
    }
}
