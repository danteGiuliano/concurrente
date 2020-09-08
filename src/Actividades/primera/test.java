
 
package Actividades.primera;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class test {

    public static void main(String[] args) {
        Colores rojo = new Colores("rojo");
        Colores verde = new Colores("verde");
        for (int i = 0; i < 10; i++) {
            Dato cuenta = new Dato();
            PingPong t1 = new PingPong(rojo.pintar("PING"), (int) (Math.random() * 2300), cuenta);
            PingPong t2 = new PingPong(verde.pintar("PONG"), (int) (Math.random() * 2000), cuenta);
            try {
                t1.start();
                t2.start();

                t1.join();
                t2.join();
            } catch (Exception e) {
                System.out.println("Error en el main.");
            }

            System.out.println(Thread.currentThread() + " chau-chau.adios");
            System.out.println(" dato " + cuenta.obtenerValor());
        }
    }

}
