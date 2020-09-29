/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio8;

/**
 *
 * @author Dan
 */
public class Atleta implements Runnable {

    private String nombre;
    private double time;
    private Testigo relevo;

    public Atleta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        boolean flag = true;
        try {
            System.out.println("Atleta: " + this.nombre + " Listo.");
            Thread.sleep(10);
            while (flag) {
                if (relevo.puedeCorrer()) {
                    /**
                     * simular tiempo de corrida.
                     */
                    double miTiempo = System.currentTimeMillis();
                    long meta = 90 + (long) (Math.random() * 250);
                    Thread.sleep(meta);
                    //calcula el tiempo al llegar a la posta y libera el siguiente.
                    time = relevo.timePosta(miTiempo);
                    flag = false; //Este hilo termino su trabajo.
                } else {
                    Thread.yield();
                }

            }

        } catch (Exception e) {
            System.out.println("Oh no! " + Thread.currentThread().getName() + " se ah fracturado");
            System.out.println(e);
        }
    }

    public double tiempoDeCarrera() {
        return time;
    }

    public void setRelevo(Testigo relevo) {
        this.relevo = relevo;
    }

    public String getNombre() {
        return this.nombre;
    }

}
