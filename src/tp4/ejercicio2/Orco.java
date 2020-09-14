package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Orco extends Personaje {

    public Orco(String unNombre, Personaje user) {
        super(unNombre, user);
    }

    public void run() {
        super.run();
    }

    public synchronized void accion() {
        System.out.println(this.nombre + ": Pego un ataque de 3");
        this.user.dañar(3);
        System.out.println(this.nombre + ": La vida de " + this.user.obtenerNombre() + " Es de: " + this.user.obtenerVida());
    }
}
