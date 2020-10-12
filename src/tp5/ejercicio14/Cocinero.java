/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ejercicio14;

/**
 *
 * @author Dan
 */
public class Cocinero extends Trabajador {

    public Cocinero(String nombre) {
        super(nombre);
    }

    @Override
    void accion() {
        try {
            System.out.println("Mozo :" + this.nombre + " No hay clientes seguire haciendo mis hobbies.");
            this.unaConfiteria.pedidoComida();
            System.out.println("Cocinero :" + this.nombre + " Buenos dias");
            this.unaConfiteria.cocineroAtiendeCliente();
            Thread.sleep(5000);
            this.accion();
        } catch (Exception e) {
            System.out.println("El cliente se canso de esperar y se fue.");
            System.out.println(e);
        }
    }

}
