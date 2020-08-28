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
public class Deportivo extends Barco{
    private int potenciaCv;
    public Deportivo(int unaEslora,String fechaFabricacion,String matricula,int potenciaCv){
        super(unaEslora,fechaFabricacion,matricula);
        this.potenciaCv=potenciaCv;
    }
    protected int getPrecioEspecial(){
        return this.potenciaCv;
    }
}
