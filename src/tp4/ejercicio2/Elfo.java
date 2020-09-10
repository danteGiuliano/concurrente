package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Elfo extends Personaje {

    private Personaje user;

    public Elfo(String unNombre, Personaje user) {
        super(unNombre);
        this.user = user;
    }

    public void run() {

        try {
            int num;
            System.out.println("Elfo, Listo");
            Thread.sleep(10);
            while (user.estaVivo()) {
                num = (int) (Math.random() * 3) + 1;
                System.out.println(this.nombre + " Ah realizado una curacion de: " + num);
                this.accion(num);
                Thread.sleep(100);
                System.out.println("La vida de: " + user.obtenerNombre() + " Es de " + user.obtenerVida());
                if (!user.estaVivo()) {
                    System.out.println(this.nombre + ": " + user.obtenerNombre() + " Murio no se puede curar mas :c");
                }
            }

        } catch (Exception e) {
            System.out.println("Error en la clase Elfo.");
        }
    }

    public synchronized void accion(int num) {
        user.curar(num);
    }

}
