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
class Administrativo extends Empleado {

    private String categoria;

    public Administrativo(int dni, String direccion, String añoNacimiento, char sexo, String legajo, String categoria) {
        super(dni, direccion, añoNacimiento, sexo, legajo);
        this.categoria = categoria;
    }
    protected boolean esTecnico(){
        return false;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "categoria=" + categoria + '}'+super.toString();
    }
}
