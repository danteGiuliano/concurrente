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
public class Yate extends Barco{
    private int cantidadCamarotes;
    private int potenciaCV;
    public Yate(int unaEslora,String unaFechaFabricacion,String unaMatricula,int cantidadCamarotes,int potenciaCV){
        super(unaEslora,unaFechaFabricacion,unaMatricula);
        this.cantidadCamarotes=cantidadCamarotes;
        this.potenciaCV=potenciaCV;
    }
    protected int getPrecioEspecial(){
        return this.cantidadCamarotes+this.potenciaCV;
    }
}
