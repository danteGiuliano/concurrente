package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Elfo extends Personaje {

    public Elfo(String unNombre, Personaje user) {
        super(unNombre, user);
    }

     public synchronized void accion() {
        System.out.println(this.nombre + ": Realizo una curacion de 3");
        this.user.curar(3);
        System.out.println(this.nombre + ": La vida de " + this.user.obtenerNombre() + " Es de: " + this.user.obtenerVida());
    }

}
