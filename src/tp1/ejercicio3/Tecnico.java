/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio3;

/**
 *
 * @author Dan
 */
class Tecnico extends Empleado {

    private Titulo unTitulo;

    public Tecnico(int dni, String direccion, String añoNacimiento, char sexo, String legajo, Titulo unTitulo) {
        super(dni, direccion, añoNacimiento, sexo, legajo);
        this.unTitulo = unTitulo;
    }
}
