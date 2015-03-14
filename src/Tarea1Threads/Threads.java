package Tarea1Threads;

/**
 *
 * @author gatuzo07
 */
public class Threads {

    public static void main(String[] args) {
        System.out.println("Tarea 1. Mostrando los Threads 3, 6 y 9 segundos");
        Josue j1 = new Josue();
        Thread t1 = new Thread(j1);
        Robbinson r1 = new Robbinson();
        Thread t2 = new Thread(r1);
        Charly c1 = new Charly();
        Thread t3 = new Thread(c1);

        t1.start();
        t2.start();
        t3.start();
    }

}
