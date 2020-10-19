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
public class Barbero extends Persona {

    public Barbero(String nombre, Barberia unaBarberia) {
        super(nombre, unaBarberia);
    }

    @Override
    public void accion()throws Exception {
       this.unaBarberia.cortarPelo(this.DATA_CLASS);
            
    }
    
}
