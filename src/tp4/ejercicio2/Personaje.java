package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Personaje implements Runnable {

    private int vida;
    protected String nombre;
    Personaje user;

    public Personaje(String nombre, Personaje user) {
        this.vida = 10;
        this.nombre = nombre;
        this.user = user;
    }
    public Personaje(String nombre){
        this.nombre=nombre;
        this.vida=10;
    }

    public void run() {
        try {
            int num;
            System.out.println(this.nombre+" Listo");
            Thread.sleep(10);

            while (user.estaVivo()) {
                this.accion();
                Thread.sleep(1000);
                if (!user.estaVivo()) {
                    System.out.println("Batalla finalizada");
                }
            }

        } catch (Exception e) {
            System.out.println("Error ");
        }
    }

    public int obtenerVida() {
        return this.vida;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public void accion() {
        System.out.println("No tengo poderes :/");
    }

    protected synchronized void curar(int cura) {
        this.vida = this.vida + cura;
    }

    protected synchronized void dañar(int daño) {
        this.vida = this.vida - daño;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}
