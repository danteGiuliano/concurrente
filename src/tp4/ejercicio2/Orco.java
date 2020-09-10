package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Orco extends Personaje {

    private Personaje user;

    public Orco(String unNombre, Personaje user) {
        super(unNombre);
        this.user = user;
    }

    public void run() {
        try {
            int num;
            System.out.println("Orco, Listo");
            Thread.sleep(10);

            while (user.estaVivo()) {
                num = (int) (Math.random() * 3) + 4;
                System.out.println(this.nombre + " Ah realizado un ataque de:" + num);
                this.accion(num);
                Thread.sleep(100);
                System.out.println("La vida de: " + user.obtenerNombre() + " Es de " + user.obtenerVida());
                if (!user.estaVivo()) {
                    System.out.println(this.nombre + ": " + user.obtenerNombre() + " Murio eh ganado!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error en la clase Orco");
        }
    }

    public synchronized void accion(int num) {
        this.user.dañar(num);
    }
}
