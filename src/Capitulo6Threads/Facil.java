package Capitulo6Threads;

/**
 *
 * @author gatuzo07
 */
public class Facil extends Thread {
    public void run(){
        try{
            Thread.sleep(3000);
        System.out.println("Soy un Thread facil");
        String nombre=Thread.currentThread().getName();
        System.out.println("Me llamo "+nombre);
            }catch(InterruptedException e){ }
        }           
}
