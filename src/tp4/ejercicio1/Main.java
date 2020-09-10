/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio1;

import Recursos.Colores;

/**
 *
 * @author Dan
 */
public class Main {

    public static void main(String[] args) {
        Colores rojo = new Colores("amarillo");
        Colores amarillo = new Colores("verde");
        VerificarCuenta vc = new VerificarCuenta();
        Thread Luis = new Thread(vc, rojo.pintar("Luis"));
        Thread Manuel = new Thread(vc, amarillo.pintar("Manuel"));
        Luis.start();
        Manuel.start();

    }
    /**
     *  try {
            Luis.join();
            Manuel.start();
        } catch (Exception e) {
            System.out.println("Error en el main.");
        }
     */
}
