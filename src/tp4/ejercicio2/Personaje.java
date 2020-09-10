
package tp4.ejercicio2;

/**
 *
 * @author Dan
 */
public class Personaje implements Runnable {

    private int vida;
    protected String nombre;

    public Personaje(String nombre) {
        this.vida = 10;
        this.nombre = nombre;

    }
    public void run(){
        System.out.println("Personaje:"+this.nombre);
    }

    public int obtenerVida() {
        return this.vida;
    }
    public String obtenerNombre(){
        return this.nombre;
    }

    protected void accion(){
        System.out.println("Soy :"+this.nombre);
    }

    protected synchronized void curar(int cura) {
        this.vida =this.vida+cura;
    }

    protected synchronized void dañar(int daño) {
        this.vida =this.vida-daño;
    }
    public boolean estaVivo(){
        return this.vida>0;
    }
}
