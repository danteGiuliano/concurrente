/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ej6;

/**
 *
 * @author Dan
 */
public class CajeraThread implements Runnable {

    private String nombre;
    private Cliente cliente;
    private long initialTime;
// Constructor, y métodos de acceso

    public CajeraThread(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = System.currentTimeMillis();
    }

    public void run() {
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + "del cliente " + this.cliente.getNombre() + "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }

    private void esperarXsegundos(int time) {
        try {
            Thread.currentThread().sleep(time*1000);
        } catch (Exception e) {
            System.out.println("Error en sleep de CajeraThread");
        }
    }
}
