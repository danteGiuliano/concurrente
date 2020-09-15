/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4.ejercicio4;

/**
 *
 * @author Dan
 */
public class Auto extends Vehiculo{

    public Auto(String patente, String marca, String modelo, int kmFaltantesParaService, Surtidor unSurtidor) {
        super(patente, marca, modelo, kmFaltantesParaService, unSurtidor);
    }

    @Override
    public void run() {
        super.run(); 
    }
    
}
