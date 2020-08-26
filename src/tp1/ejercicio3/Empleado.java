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
 class Empleado extends Persona {

    private String legajo;
    private int antiguedad;
    /*
    Al usar las palabras reservadas de Java private, protected, o public
    la informacion se encapsula de una forma diferente
    
    protected: solo las subclases pueden acceder a ellas, como si fuera un atributo/metodo propio
    private: las subclases no pueden acceder a ellas es algo propio de la instancia.
    public: son variables de instancias que pueden ser accedidas por toda clase asociada o heredada.
    */

    public Empleado(int dni, String direccion, String añoNacimiento, char sexo, String legajo) {
        super(dni, direccion, añoNacimiento, sexo);
        this.antiguedad = 0;
        this.legajo = legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    
    

}
