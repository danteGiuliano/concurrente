/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.ejercicio2;

/**
 *
 * @author Dan
 */
public class Velero extends Barco {
    private int cantidadVelas;
    public Velero(int eslora,String añoFabricacion,String matricula,int cantidadVelas){
        super(eslora,añoFabricacion,matricula);
        this.cantidadVelas=cantidadVelas;
    }
    @Override
    protected int getPrecioEspecial(){
        return this.cantidadVelas;
    }
}
