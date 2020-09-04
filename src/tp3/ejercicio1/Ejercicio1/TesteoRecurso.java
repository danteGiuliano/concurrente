/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.ejercicio1.Ejercicio1;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class TesteoRecurso {

  
    public static void main(String[] args) {
        Colores rojo= new Colores("rojo");
        Colores verde = new Colores("verde");
        for (int i = 0; i < 10; i++) {
            Cliente juan = new Cliente();
            juan.setName(rojo.pintar("Juan Lopez"));
            Cliente ines = new Cliente();
            ines.setName(verde.pintar("Ines Garcia"));
            juan.start();
            ines.start();
        }
        /**
         * La funcionalidad del codigo Recurso es acceder al hilo asociado de
         * cliente, e imprimirlo. como ambos metodos se acceden al mismo tiempo,
         * Java no sabe a quien darle preferencia por lo tanto se genera una
         * "speudo aleatoriedad". cuando se ejecuta la clase Cliente
         *
         *
         * segunda opcion: primero se genera el proceso Cliente Heredado de
         * Thread, dicho metodo tiene asociado un metodo de clase de
         * ThreadCurrent que devuelve la instancia del hijo. y luego se imprime
         * como esos 2 procesos se acceden por separado en memoria, genera una
         * aleatoriedad
         *
         * Fuente: ctrl+click en ThreadCurrent y ver la documentacion.
         */
    }

}
