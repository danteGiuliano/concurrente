/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades.grupal.ejercicio3;

/**
 *
 * @author Dan
 */
public class Cliente extends Persona{

    public Cliente(String nombre, Barberia unaBarberia) {
        super(nombre, unaBarberia);
    }

    @Override
    public void accion()throws Exception {
        this.unaBarberia.entrarBarberia(this.DATA_CLASS);
    }
    

    
}
