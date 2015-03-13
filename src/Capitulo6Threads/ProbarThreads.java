package Capitulo6Threads;

/**
 *
 * @author gatuzo07
 *
 * 1) Threads Iniciando la clase Thread. com.capitulo6.threads 1. Creado 2.
 * Inicializado 3. Ejecución (Run) 4. Pausa (Cuando hay mas de un thread) 5.
 * Muerte
 *
 * 2) Implementando la interface Runnable
 *
 * 3) Usando clase internas anonimas Se recomienda su uso para tareas que se
 * deban realizar sin la acción directa del usuario Se les conoce tambien como
 * background Threads
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probar Threads");
        //Paso 1. Crearlo
        Facil t1 = new Facil();
        Facil t11 = new Facil();
        Relojito t4 = new Relojito ();
        Regular r1 = new Regular();
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Soy un Thread mucho mejor");
            }
        }
        );
        //t1.setName("Ricardo");
        //Paso 2. Inicializado
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        t4.start();
        
    }

}
