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
public class Empleado extends Persona {
    private String legajo;
   private int antiguedad;
    
    
    public Empleado(int dni,String direccion,String añoNacimiento,char sexo,String legajo){
        super(dni,direccion,añoNacimiento,sexo);
        this.antiguedad=0;
        this.legajo=legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}
