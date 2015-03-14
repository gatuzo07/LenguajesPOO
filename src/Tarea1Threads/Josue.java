package Tarea1Threads;

/**
 *
 * @author gatuzo07
 */
public class Josue implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Josue");
        } catch (InterruptedException e) {
        }
    }
}
