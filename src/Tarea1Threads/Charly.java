package Tarea1Threads;

/**
 *
 * @author gatuzo07
 */
public class Charly implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(9000);
            System.out.println("Charly");
        } catch (InterruptedException e) {
        }
    }
}
