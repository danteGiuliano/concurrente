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
 public class Titulo {
     private String nombre;
    private int añoTitulo;
    private int sueldoBase;
    

    public Titulo(String nombre, int añoTitulo, int sueldoBase) {
        this.nombre = nombre;
        this.añoTitulo = añoTitulo;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAñoTitulo() {
        return añoTitulo;
    }
    
}
